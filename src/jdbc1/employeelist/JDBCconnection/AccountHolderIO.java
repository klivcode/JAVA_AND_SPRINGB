package jdbc1.employeelist.JDBCconnection;

import jdbc1.employeelist.EmpLOYEE;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AccountHolderIO extends DisplayManager {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    // Read Integer safely
    public Integer readInt(String message) {
        while (true) {
            try {
                System.out.println(message);
                String input = bufferedReader.readLine();

                if (input == null || input.trim().isEmpty()) {
                    System.out.println("❌ Input cannot be empty. Please enter a number.");
                    continue;
                }

                return Integer.parseInt(input.trim());
            } catch (NumberFormatException e) {
                System.out.println("❌ Invalid number. Please try again.");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    // Read String safely
    public String readString(String message) {
        while (true) {
            try {
                System.out.println(message);
                String input = bufferedReader.readLine();

                if (input == null || input.trim().isEmpty()) {
                    System.out.println("❌ Input cannot be empty. Please enter text.");
                    continue;
                }

                return input.trim();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    // Read Float safely
    public Float readFloat(String message) {
        while (true) {
            try {
                System.out.println(message);
                String input = bufferedReader.readLine();

                if (input == null || input.trim().isEmpty()) {
                    System.out.println("❌ Input cannot be empty. Please enter a decimal number.");
                    continue;
                }

                return Float.parseFloat(input.trim());
            } catch (NumberFormatException e) {
                System.out.println("❌ Invalid decimal number. Please try again.");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    // Read Long safely
    public Long readLong(String message) {
        while (true) {
            try {
                System.out.println(message);
                String input = bufferedReader.readLine();

                if (input == null || input.trim().isEmpty()) {
                    System.out.println("❌ Input cannot be empty. Please enter a number.");
                    continue;
                }

                return Long.parseLong(input.trim());
            } catch (NumberFormatException e) {
                System.out.println("❌ Invalid number. Please try again.");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    // Read EmpLOYEE details
    public EmpLOYEE readAccountHolder() {
        EmpLOYEE employee = new EmpLOYEE();
        employee.setAccountHolderName(readString("Enter Account Holder Name: "));
        employee.setAccountNumber(readLong("Enter Account Number: "));
        employee.setBalance(readFloat("Enter Balance: "));
        employee.setOverdraftLimit(readFloat("Enter Overdraft Limit: "));
        employee.setKycVerified(readString("Is it KYC verified (yes/no): "));
        employee.setPerDayWithdrawalLimit(readFloat("Enter Per Day Withdrawal Limit: "));
        return employee;
    }
}
