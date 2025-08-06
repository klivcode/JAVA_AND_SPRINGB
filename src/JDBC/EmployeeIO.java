package JDBC;

import EmployeeList.Employee;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EmployeeIO extends DisplayManager{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public int readInt(String msg){
        try{
            show(msg);
            return Integer.parseInt(br.readLine());
        }catch(Exception e){
            show(e.getMessage());
            return 0;
        }
    }


    public float readFloat(String msg){
        try{
            show(msg);
            return Float.parseFloat(br.readLine());
        }catch(Exception e){
            show(e.getMessage());
            return 0;
        }
    }


    public String readString(String msg){
        try{
            show(msg);
            return br.readLine();
        }catch(Exception e){
            show(e.getMessage());
            return "";
        }
    }

    public Employee readEmployee(){
        Employee emp = new Employee();
        emp.setFullName(readString("Full Name"));
        emp.setEmail(readString("Email"));
        emp.setAddress(readString("Address"));
        emp.setMobileNumber(readString("Mobile Number"));
        emp.setDepartment(readString("Department"));
        emp.setSalary(readFloat("Enter salary"));
        emp.setYearsOfExperience(readInt("Years of Experience"));

        return emp;
    }
}
