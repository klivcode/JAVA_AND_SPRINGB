package Excersise_Java;

import java.util.Scanner;

public class SumOfNumberTHree {


    public static int sumALL(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println("Enter the three number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = sumALL(a,b,c);
        System.out.println("Sum is\t"+ sum);

    }
}
