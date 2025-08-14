package jdbc1.employeelist.JDBCconnection;

import jdbc1.employeelist.EmpLOYEE;
import jdbc1.employeelist.EmployeeDataSource;

import java.util.List;

public class AccountHolderExecut extends AccountHolderIO {
    AccountHolderOperations accountHolderOperations = new AccountHolderOperations();

    public AccountHolderExecut() {
        String filePath = "src/com/JDBC/account_details.txt";
        boolean status = true;
        while (status) {
            DisplayManager.showmenu();
            System.out.println("-----------------------------------------------------------------------------------------------------------------------");

            int choice = readInt("Please enter your choice: ");
            switch (choice) {
                case 1:
                    System.out.println("Inserting.....................");
                    accountHolderOperations.InsertAccountHolder(readAccountHolder());
                    break;
                case 2:
                    List<EmpLOYEE> employeeList = accountHolderOperations.showAccountHolderlist();
                    DisplayManager.displayAccounHolderList(employeeList);

                    break;
                case 3:

                    EmployeeDataSource batchDataSource = new EmployeeDataSource();
                    List<EmpLOYEE> batchEmployees = batchDataSource.readEmployeeDataFromTextFile(filePath);
                    accountHolderOperations.InsertAccountHolderBatch(batchEmployees);
                    break;
                case 4:
                    List<EmpLOYEE> kycVerified = accountHolderOperations.getKycVerifiedAccountHolders();
                    DisplayManager.displayAccounHolderList(kycVerified);
                    break;

                case 5:
                    long accNum = readLong("Enter account number: ");
                    float newBal = readFloat("Enter new balance: ");
                    boolean updated = accountHolderOperations.updateBalanceByAccountNumber(accNum, newBal);
                    if (updated) {
                        System.out.println("Balance updated successfully.");
                    } else {
                        System.out.println("Account not found or update failed.");
                    }
                    break;
                case 6:
                    System.out.println("Showing all AccountHolder sorted by balance in descending order:");
                    List<EmpLOYEE> sortedList = accountHolderOperations.getAccountHolderSortedByBalanceDesc();
                    DisplayManager.displayAccounHolderList(sortedList);
                    break;
                case 7:
                    int page = readInt("Enter page number to view (10 records per page): ");
                    List<EmpLOYEE> paginatedList = accountHolderOperations.getPaginatedAccountHolders(page);
                    if (paginatedList.isEmpty()) {
                        System.out.println("No records found on this page.");
                    } else {
                        DisplayManager.displayAccounHolderList(paginatedList);
                    }
                    break;
                case 8:
                    System.out.println("Thank you");
                    status = false;
                    break;


                default:
                    System.out.println("Invalid choice!!!");
            }
            System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        }
    }
}



