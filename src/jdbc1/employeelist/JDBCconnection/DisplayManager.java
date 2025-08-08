package jdbc1.employeelist.JDBCconnection;

import jdbc1.employeelist.EmpLOYEE;

import java.util.List;

public class DisplayManager {
    public static void showmenu() {
        System.out.println("1. Insert AccountHolder");
        System.out.println("2. Show all AccountHolder");

        System.out.println("3. Insert AccountHolder using batch processing");
        System.out.println("4. Show all KYC verified AccountHolder");
        System.out.println("5. Update Balance of AccountHolder");
        System.out.println("6. Show all AccountHolder sorted by balance in Descending order");
        System.out.println("7. Show paginated AccountHolders (10 per page)");
        System.out.println("8. Exit");

    }

    public static void displayAccounHolderList(List<EmpLOYEE> employees) {
        for (EmpLOYEE employee : employees) {
            displayAccounholder(employee);
        }

    }

    public static void displayAccounholder(EmpLOYEE employee) {
        System.out.println(employee.toString());
    }
}