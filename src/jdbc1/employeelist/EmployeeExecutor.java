package jdbc1.employeelist;


import java.util.List;

public class EmployeeExecutor {
    public static void main(String[] args) {
        String filePath = "D:\\pHASE II\\account_details";
        EmployeeDataSource employeeDataSource = new EmployeeDataSource();
        List<EmpLOYEE> employeeList = employeeDataSource.readEmployeeDataFromTextFile(filePath);

        System.out.println(employeeList);


    }
}