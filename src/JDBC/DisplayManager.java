package JDBC;

import EmployeeList.Employee;

import java.util.List;

public class DisplayManager {

    public static void showMenu() {
        show("1. Insert Employee");
        show("2. Show All Employee");
        show("3. Load Employee");
        show("4. Exit");
    }

    public static void show(String msg)
    {
        System.out.println(msg);
    }

    public static void showLine()
    {
        System.out.println("------------------------------------------");
    }

    public static void displayEmployeeList(List<Employee> employeeList)
    {
        for (Employee employee:employeeList)
        {
            displayEmployeeList(employee);
        }
    }
    public static void displayEmployeeList(Employee employee)
    {
        show(employee.toString());
    }
}
