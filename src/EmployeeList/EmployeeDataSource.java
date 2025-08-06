    // Class blueprint executor functionality.
package EmployeeList;


    import java.io.File;
    import java.util.ArrayList;
    import java.util.List;
    import java.util.Scanner;

    public class EmployeeDataSource {

        public List<Employee> readEmployeDataFromTextFile(String textFileath){
            List<Employee> employeeList = new ArrayList<>();
            try{
              File file = new File(textFileath);
              Scanner scanner = new Scanner(file);
              int count = 0;
              while(scanner.hasNextLine()){
                  if(count==0){
                      count++;
                      scanner.nextLine();
                      continue;
                  }
                  String line = scanner.nextLine();
                  //Now add in employee list
                  employeeList.add(readEmployeeFromLine(line));

              }
            }catch(Exception e){
                e.printStackTrace();
                return new ArrayList<>();
            }
            return employeeList;
        }
        public Employee readEmployeeFromLine(String line){

            String[] tokens = line.split("\t");
            //Here calling the constructor and Parse them
            return new Employee(
                    tokens[0],
                    tokens[1],
                    tokens[2],
                    tokens[3],
                    tokens[4],
                    Double.parseDouble(tokens[5]),
                    Short.parseShort(tokens[6])
            );

        }


}
