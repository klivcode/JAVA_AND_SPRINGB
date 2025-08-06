package EmployeeList;

import java.io.File;
import java.lang.invoke.StringConcatFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeDataSource {

    public List<Employee> readEmployeeFromTextfile(String textFilePath) {
        //In this array we will store the data reading from the txt
        List<Employee> employeeList = new ArrayList<>();

        int count = 0;
       try{
           File file = new File(textFilePath);
           Scanner scanner=new Scanner(file);
           while(scanner.hasNextLine()){
               if(count==0)
               {
                   count++;
                   scanner.nextLine();
                   continue;

               }
               String line = scanner.nextLine();
               employeeList.add(readEmployeeFromLine(line));
           }
       }catch (Exception e){
           e.printStackTrace();
           return new ArrayList<>();
       }
        return employeeList;
    }


    public  Employee readEmployeeFromLine(String line)
    {
        String[] lineArray = line.split("\t");
        return new Employee(
                lineArray[0],
                lineArray[1],
                lineArray[2],
                lineArray[3],
                lineArray[4],
                Float.parseFloat(lineArray[5]),
                Integer.parseInt(lineArray[6])
        );

    }

}
