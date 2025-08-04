package Excersise_Java;

import java.util.Scanner;

public class AllPrimeNUmber_INRange {

    public static int AllPrimeNumberInRange(int start, int end) {
        int p=2;

        for (int i=start; i<=end; i++) {
            if(i%p==0) {
                System.out.println(i);
            }
        }

    return 0;
    }

    public static void main(String[] args) {
        System.out.println("Enter the  range 1 to 100 ");
        Scanner sc = new Scanner(System.in);
        int st= sc.nextInt();
        int end= sc.nextInt();
        AllPrimeNUmber_INRange obj = new AllPrimeNUmber_INRange();
        System.out.println(obj.AllPrimeNumberInRange(st,end));
    }

}
