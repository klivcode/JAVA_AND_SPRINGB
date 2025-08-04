package Excersise_Java;

import java.util.Scanner;

public class RangeDisplayNumber {
    public static int RangeDisplayNumber(int start, int end) {
        for(int i =start; i<=end; i++){
            System.out.println(i);
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of starting to end");
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        RangeDisplayNumber(start,end);
    }
}
