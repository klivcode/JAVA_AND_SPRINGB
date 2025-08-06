package EmployeeList;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeUtils {

    public Employee employeeWithHighestSalary(List<Employee> employeeList) {

        return employeeList.stream()
                .max(Comparator.comparingDouble(Employee::getMonthlySalary)).orElse(null);
    }
    public Employee employeeWithLowestSalary(List<Employee> employeeList) {

        return employeeList.stream()
                .min(Comparator.comparingDouble(Employee::getMonthlySalary)).orElse(null);
    }
    public double sumOfEmployeeSalary(List<Employee> employeeList) {

        return employeeList.stream()
                .mapToDouble(Employee::getMonthlySalary).sum();
    }
    public Map<String, Integer> employeeCountBasedOnDepartment(List<Employee> employeeList) {

        Map<String, Integer> department = new HashMap<>();
        for (Employee e : employeeList) {
            department.put(e.getDepartment(),
                    department.getOrDefault(e.getDepartment(), 0) + 1);
        }
        return department;
    }
    private boolean containsAllVowels(String name) {
        name = name.toLowerCase();
        return  name.contains("a") &&
                name.contains("e") &&
                name.contains("i") &&
                name.contains("o") &&
                name.contains("u");
    }
    public List<Employee> employeeWIthAllVowelsInName(List<Employee> employeeList) {
        return employeeList.stream()
                .filter(e -> containsAllVowels(e.getName()))
                .collect(Collectors.toList());
    }
    public List<Employee> employerExperience(List<Employee> employeeList) {
        return employeeList.stream()
                .filter(e -> e.getYearsOfExprinece() > 10)
                .collect(Collectors.toList());
    }
}
