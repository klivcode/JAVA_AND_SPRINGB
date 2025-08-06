package JDBC;

import EmployeeList.Employee;
import EmployeeList.EmployeeDataSource;

import java.util.List;

public class EmployeeDatabaseExecutor extends EmployeeIO {
    EmployeeDatabaseOperation employeeDatabaseOperation = new EmployeeDatabaseOperation();
        public EmployeeDatabaseExecutor(){
            boolean status = true;
            while (status){
                DisplayManager.showMenu();
                showMenu();
                int choice=readInt("Enter your choice: ");
                switch(choice){
                    case 1:
                        show("Insert Operation...");
                        employeeDatabaseOperation.insertEmployee(readEmployee());
                        break;
                        case 2:
                            show("Showing All Employee......");
                            List<Employee> employeeList=employeeDatabaseOperation.showAllEmployees();
                            displayEmployeeList(employeeList);
                            break;
                            case 3:
                                show("Load Employee...");
                                EmployeeDataSource  employeeDataSource = new EmployeeDataSource();
                                String filePath="D:\\pHASE II\\fake_employee_data.txt";
                                List<Employee> fileEmployeeList=employeeDataSource.readEmployeeFromTextfile(filePath);
                                for(Employee employee:fileEmployeeList){
                                employeeDatabaseOperation.insertEmployee(employee);
                                }
                                break;
                                case 4:
                                    show("Exiting...");
                                    status=false;
                                    break;
                                    default:
                                        show("Invalid choice");
                }
                showLine();

            }
    }

}
