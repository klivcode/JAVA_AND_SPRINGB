package Excersise_Java;

import java.util.Scanner;

public class FactorialNumber {

    public static int factorial(int number){
        if(number ==0 || number ==1){
            return 1;
        }
        return number*factorial(number-1);
    }


    public static void main(String[] args) {
        System.out.println("Enter the number to get the fatorial");
        Scanner sc = new Scanner(System.in);
        int number= sc.nextInt();
        int factorialResult=factorial(number);
        System.out.println(factorialResult);

    }
}
