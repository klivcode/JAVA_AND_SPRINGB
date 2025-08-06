package EmployeeList;

import java.util.List;
import java.util.Scanner;

public class EmployeeExecutor {
    public static void main(String[] args) {
    EmployeeDataSource employeeDataSource = new EmployeeDataSource();
    String filePath="D:\\pHASE II\\fake_employee_data.txt";
//    employeeDataSource.readEmployeDataFromTextFile(filePath);
    List<Employee> employeeList= employeeDataSource.readEmployeDataFromTextFile(filePath);
        //TODO Switch

        EmployeeUtils employeeUtils = new EmployeeUtils();
        System.out.println(employeeUtils.employeeWithHighestSalary(employeeList));
        System.out.println(employeeUtils.employeeWithHighestSalary(employeeList));
        System.out.println(employeeUtils.employeeWithHighestSalary(employeeList));
        System.out.println(employeeUtils.employeeWithHighestSalary(employeeList));
    }
}
