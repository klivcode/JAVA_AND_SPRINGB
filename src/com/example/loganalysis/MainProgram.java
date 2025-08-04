package com.example.loganalysis;

import com.example.loganalysis.model.LogResponse;
import com.example.loganalysis.service.LogAnalyzer;
import com.example.loganalysis.service.LogAnalyzerImpl;
import com.example.loganalysis.util.LogParser;

import java.text.SimpleDateFormat;
import java.util.*;

public class MainProgram {
    public static void main(String[] args) {

        String filePath = "C:\\Users\\Jitu\\Downloads\\sampledataset.txt";

        List<LogResponse> logs = LogParser.parseLogFile(filePath);
        LogAnalyzer analyzer = new LogAnalyzerImpl(logs);

        // Print available month-wise breakdown
        Set<String> allMonths = new TreeSet<>();
        SimpleDateFormat sdf = new SimpleDateFormat("MMMyyyy", Locale.ENGLISH);
        for (LogResponse log : logs) {
            allMonths.add(sdf.format(log.getDate()));
        }

        System.out.println(" Monthly Report:");
        for (String month : allMonths) {
            System.out.println("  " + month);
            System.out.println("   Success: " + analyzer.countSuccessByMonth(month));
            System.out.println("   Failed : " + analyzer.countFailureByMonth(month));
        }

        System.out.println("\n Total PdfSign requests: " + analyzer.countRequestType("PdfSign"));
        System.out.println(" Total unique months: " + analyzer.countUniqueMonths());
    }
}
