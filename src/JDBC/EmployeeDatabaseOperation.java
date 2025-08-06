package JDBC;

import EmployeeList.Employee;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDatabaseOperation {
    DatabaseConnection databaseConnection = new DatabaseConnection();
    public void insertEmployee(Employee e){
        try{
            String INSERT_SQL
                    = "Insert into employee(full_name, email, address, mobile_number, department, salary, year_of_experinece)\n "+
                    "values(?,?,?,?,?,?,?)";
            PreparedStatement insertStatement=
                    databaseConnection.connection.prepareStatement(INSERT_SQL);
            insertStatement.setString(1, e.getFullName());
            insertStatement.setString(2, e.getEmail());
            insertStatement.setString(3, e.getAddress());
            insertStatement.setString(4, e.getMobileNumber());
            insertStatement.setString(5, e.getDepartment());
            insertStatement.setDouble(6, e.getSalary());
            insertStatement.setInt(7,e.getYearsOfExperience());

            int rowsAffected=insertStatement.executeUpdate();
            if(rowsAffected>0){
                System.out.println("Employee inserted successfully");
            }
            else{
                System.out.println("Employee insert failed");
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public List <Employee> showAllEmployees() {
        try{
            String SELECT_SQL
                    = "select * from employee";
            PreparedStatement selectStatement=
                    databaseConnection.connection.prepareStatement(SELECT_SQL);
            ResultSet resultSet =selectStatement.executeQuery();
            List <Employee> employees=new ArrayList<Employee>();
            while(resultSet.next()){
                Employee employee=new Employee();
                employee.setFullName(resultSet.getString("full_name"));
                employee.setEmail(resultSet.getString("email"));
                employee.setAddress(resultSet.getString("address"));
                employee.setMobileNumber(resultSet.getString("mobile_number"));
                employee.setDepartment(resultSet.getString("department"));
                employee.setSalary(resultSet.getFloat("salary"));
                employee.setYearsOfExperience(resultSet.getInt("year_of_experinece"));
                employees.add(employee);
            }
            return employees;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return new ArrayList<>();
        }

    }
}
