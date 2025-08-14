package jdbc1.employeelist.JDBCconnection;


import jdbc1.employeelist.EmpLOYEE;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AccountHolderOperations {
    Conn conn = new Conn();

    public void InsertAccountHolder(EmpLOYEE employee) {
        try {
            String insert_sql = "INSERT INTO accountHolder (accountHolderName,accountNumber,balance,overdraftLimit,kycVerified,perdDayWithdrawlLimit)VALUES (?, ?, ?, ?, ?, ?);";
            PreparedStatement insertStatement = conn.connection.prepareStatement(insert_sql);

            insertStatement.setString(1, employee.getAccountHolderName());
            insertStatement.setString(2, employee.getAccountNumber().toString());
            insertStatement.setFloat(3, employee.getBalance());
            insertStatement.setFloat(4, employee.getOverdraftLimit());
            insertStatement.setString(5, employee.getKycVerified());
            insertStatement.setFloat(6, employee.getPerDayWithdrawalLimit());

            int rowsAffected = insertStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Employee Inserted Successfully");
            } else {
                System.out.println("Employee insert failed");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void InsertAccountHolderBatch(List<EmpLOYEE> employees) {
        try {
            String insert_sql = "INSERT INTO AccountHolder VALUES (?, ?, ?, ?, ?, ?);";
            PreparedStatement insertStatement = conn.connection.prepareStatement(insert_sql);

            for (EmpLOYEE employee : employees) {
                insertStatement.setString(1, employee.getAccountHolderName());
                insertStatement.setString(2, employee.getAccountNumber().toString());
                insertStatement.setFloat(3, employee.getBalance());
                insertStatement.setFloat(4, employee.getOverdraftLimit());
                insertStatement.setString(5, employee.getKycVerified());
                insertStatement.setFloat(6, employee.getPerDayWithdrawalLimit());

                insertStatement.addBatch();  // add to batch
            }

            int[] result = insertStatement.executeBatch(); // execute all at once

            System.out.println("Batch insert completed. Number of records inserted: " + result.length);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public List<EmpLOYEE> showAccountHolderlist() {
        List<EmpLOYEE> employees = new ArrayList<>();

        try {
            String select_sql = "select * from AccountHolder;";
            PreparedStatement insertStatement = conn.connection.prepareStatement(select_sql);

            ResultSet resultSet = insertStatement.executeQuery();

            while (resultSet.next()) {

                EmpLOYEE employee = new EmpLOYEE();
                employee.setAccountHolderName(resultSet.getString("accountHolderName"));
                employee.setAccountNumber(Long.parseLong(resultSet.getString("accountNumber")));
                employee.setBalance(resultSet.getFloat("balance"));
                employee.setOverdraftLimit(resultSet.getFloat("overdraftLimit"));
                employee.setKycVerified(resultSet.getString("kycVerified"));
                employee.setPerDayWithdrawalLimit(resultSet.getFloat("perDayWithdrawalLimit"));
                employees.add(employee);

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new ArrayList<>();
        }
        return employees;
    }

    public List<EmpLOYEE> getKycVerifiedAccountHolders() {
        List<EmpLOYEE> verifiedEmployees = new ArrayList<>();
        try {
            String sql = "SELECT * FROM AccountHolder WHERE kycVerified = ?";
            PreparedStatement preparedStatement = conn.connection.prepareStatement(sql);
            preparedStatement.setString(1, "Yes");

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                EmpLOYEE employee = new EmpLOYEE();
                employee.setAccountHolderName(rs.getString("accountHolderName"));
                employee.setAccountNumber(Long.parseLong(rs.getString("accountNumber")));
                employee.setBalance(rs.getFloat("balance"));
                employee.setOverdraftLimit(rs.getFloat("overdraftLimit"));
                employee.setKycVerified(rs.getString("kycVerified"));
                employee.setPerDayWithdrawalLimit(rs.getFloat("perDayWithdrawalLimit"));
                verifiedEmployees.add(employee);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new ArrayList<>();
        }
        return verifiedEmployees;
    }

    public boolean updateBalanceByAccountNumber(long accountNumber, float newBalance) {
        try {
            String sql = "UPDATE AccountHolder SET balance = ? WHERE accountNumber = ?";
            PreparedStatement preparedStatment = conn.connection.prepareStatement(sql);
            preparedStatment.setFloat(1, newBalance);
            preparedStatment.setLong(2, accountNumber);

            int rowsUpdated = preparedStatment.executeUpdate();
            return rowsUpdated > 0;
        } catch (Exception e) {
            System.out.println("Error updating balance: " + e.getMessage());
            return false;
        }
    }

    public List<EmpLOYEE> getAccountHolderSortedByBalanceDesc() {
        List<EmpLOYEE> employeeList = new ArrayList<>();
        try {
            String query = "SELECT * FROM AccountHolder ORDER BY balance DESC";
            PreparedStatement preparedStatement = conn.connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                EmpLOYEE employee = new EmpLOYEE();
                employee.setAccountHolderName(rs.getString("accountHolderName"));
                employee.setAccountNumber(rs.getLong("accountNumber"));
                employee.setBalance(rs.getFloat("balance"));
                employee.setOverdraftLimit(rs.getFloat("overdraftLimit"));
                employee.setPerDayWithdrawalLimit(rs.getFloat("perDayWithdrawalLimit"));
                employee.setKycVerified(rs.getString("kycVerified"));
                employeeList.add(employee);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return employeeList;
    }

    public List<EmpLOYEE> getPaginatedAccountHolders(int pageNumber) {
        List<EmpLOYEE> employeeList = new ArrayList<>();
        int pageSize = 10;
        int offset = (pageNumber - 1) * pageSize;

        try {
            String query = "SELECT * FROM AccountHolder LIMIT ? OFFSET ?";
            PreparedStatement pstmt = conn.connection.prepareStatement(query);
            pstmt.setInt(1, pageSize);
            pstmt.setInt(2, offset);

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                EmpLOYEE employee = new EmpLOYEE();
                employee.setAccountHolderName(rs.getString("accountHolderName"));
                employee.setAccountNumber(rs.getLong("accountNumber"));
                employee.setBalance(rs.getFloat("balance"));
                employee.setOverdraftLimit(rs.getFloat("overdraftLimit"));
                employee.setPerDayWithdrawalLimit(rs.getFloat("perDayWithdrawalLimit"));
                employee.setKycVerified(rs.getString("kycVerified"));
                employeeList.add(employee);
            }

        } catch (Exception e) {
            System.out.println("Error during pagination: " + e.getMessage());
        }

        return employeeList;
    }


}