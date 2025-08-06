package EmployeeList;

import java.util.List;

public class EmployeeExecutor {

    public static void main(String[] args) {
        EmployeeDataSource employeeDataSource = new EmployeeDataSource();
        String filePath="D:\\pHASE II\\fake_employee_data.txt";
        List<Employee> employeeList=employeeDataSource.readEmployeeFromTextfile(filePath);
        EmployeeUtils employeeUtils = new EmployeeUtils();


        System.out.println(employeeUtils.employeeWithHighestSalary(employeeList));
        System.out.println(employeeUtils.employeeWithLowestSalary(employeeList));
        System.out.println(employeeUtils.sumOfEmployeeSalary(employeeList));
        System.out.println(employeeUtils.employeeCountBased(employeeList));

    }




}
