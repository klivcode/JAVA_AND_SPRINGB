package Excersise_Java;

import java.util.Scanner;

public class GetTotal {
    public static int getTotal(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount");
        int a= sc.nextInt();
        int b= sc.nextInt();

        int result = getTotal(a,b);
        System.out.println("Total Sum is "+ result);
    }
}
