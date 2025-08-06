package EmployeeList;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeUtils {

    // Returns the employee with the highest salary
    public Employee employeeWithHighestSalary(List<Employee> employeeList) {
        return employeeList.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .orElse(null);
    }

    // Returns the employee with the lowest salary
    public Employee employeeWithLowestSalary(List<Employee> employeeList) {
        return employeeList.stream()
                .min(Comparator.comparing(Employee::getSalary))
                .orElse(null);
    }

    // Returns the sum of all employee salaries
    public double sumOfEmployeeSalary(List<Employee> employeeList) {
        return employeeList.stream()
                .mapToDouble(Employee::getSalary)
                .sum();
    }

    // Returns a map with department name as key and number of employees as value
    public Map<String, Long> employeeCountBased(List<Employee> employeeList) {
            return employeeList.stream()
                    .collect(Collectors.groupingBy(
                            Employee::getDepartment,
                            Collectors.counting()
                    ));
    }
}

