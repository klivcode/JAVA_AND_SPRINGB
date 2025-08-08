package jdbc1.employeelist;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeDataSource {

    public List<EmpLOYEE> readEmployeeDataFromTextFile(String textFilePath) {
        List<EmpLOYEE> employeeList = new ArrayList<>();

        try {
            File file = new File(textFilePath);
            Scanner scanner = new Scanner(file);

            boolean isFirstLine = true;

            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();

                if (isFirstLine) {
                    isFirstLine = false; // skip header
                    continue;
                }

                // Avoid empty lines
                if (data.trim().isEmpty()) continue;

                employeeList.add(readEmployeeFromData(data));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }

        return employeeList;
    }

    public EmpLOYEE readEmployeeFromData(String data) {
        String[] parts = data.split("\t");

        if (parts.length < 6) {
            System.out.println("Invalid data line: " + data);
            return null;
        }

        try {
            return new EmpLOYEE(parts[0], Long.parseLong(parts[1]), Float.parseFloat(parts[2]), Float.parseFloat(parts[3]), parts[4], Float.parseFloat(parts[5]));
        } catch (NumberFormatException e) {
            System.out.println("Error parsing number in line: " + data);
            return null;
        }
    }
}