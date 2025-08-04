package com.example.loganalysis.util;

import com.example.loganalysis.model.LogResponse;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;

public class LogParser {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy:HH:mm:ss", Locale.ENGLISH);

    public static List<LogResponse> parseLogFile(String filePath) {
        List<LogResponse> logs = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                int bracketClose = line.indexOf("]");
                String dateStr = line.substring(1, bracketClose).trim();
                Date date = sdf.parse(dateStr);

                String json = line.substring(bracketClose + 1).trim()
                        .replace("{", "")
                        .replace("}", "")
                        .replace("\"", "");

                String[] parts = json.split(",\\s*");
                Map<String, String> map = new HashMap<>();
                for (String part : parts) {
                    String[] kv = part.split(":", 2);
                    if (kv.length == 2) {
                        map.put(kv[0].trim(), kv[1].trim());
                    }
                }

                logs.add(new LogResponse(
                        date,
                        map.getOrDefault("requestType", ""),
                        map.getOrDefault("status", ""),
                        map.getOrDefault("data", "")
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return logs;
    }
}
