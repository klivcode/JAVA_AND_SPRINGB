package EmployeeList;

public class Employee {
        private String name;
        private String address;
        private String email;
        private String mobileNumber;
        private String department;
        private double monthlySalary;
        private short yearsOfExprinece;


    // Default Constructor
         public Employee()
         {

         }
        //Parametrized Constructor
    public Employee(String name, String address, String email, String mobileNumber, String department, double monthlySalary, short yearsOfExprinece) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.department = department;
        this.monthlySalary = monthlySalary;
        this.yearsOfExprinece = yearsOfExprinece;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public short getYearsOfExprinece() {
        return yearsOfExprinece;
    }

    public void setYearsOfExprinece(short yearsOfExprinece) {
        this.yearsOfExprinece = yearsOfExprinece;
    }
}
