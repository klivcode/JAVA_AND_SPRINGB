package jdbc1.employeelist.JDBCconnection;

import jdbc1.employeelist.EmpLOYEE;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AccountHolderIO extends DisplayManager {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public Integer readInt(String message) {
        try {
            System.out.println(message);
            return Integer.parseInt(bufferedReader.readLine());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String readString(String message) {
        try {
            System.out.println(message);
            return bufferedReader.readLine();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Float readFloat(String message) {
        try {
            System.out.println(message);
            return Float.parseFloat(bufferedReader.readLine());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return (float) 0;
        }
    }

    public Long readLong(String message) {
        try {
            System.out.println(message);
            return Long.parseLong(bufferedReader.readLine());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 0L;
        }
    }

    public EmpLOYEE readAccountHolder() {
        EmpLOYEE employee = new EmpLOYEE();
        employee.setAccountHolderName(readString("Enter AccountHolder Name: "));
        employee.setAccountNumber(readLong("Enter Account Number: "));
        employee.setBalance(readFloat("Enter Balance: "));
        employee.setOverdraftLimit(readFloat("Enter Over draft limit : "));
        employee.setKycVerified(readString("Is it kyc verified(yes/no): "));
        employee.setPerDayWithdrawalLimit(readFloat("Enter per day withdrawal limit : "));
        return employee;
    }


}


