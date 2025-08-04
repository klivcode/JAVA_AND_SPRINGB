package Excersise_Java;

import java.util.Scanner;

public class RangeDisplayOdd_Number {

    public static int RangeDisplayOdd_Number(int start, int end){
        for(int i = start; i <= end; i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Enter start and end for odd range")
        ;
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        RangeDisplayOdd_Number(start, end);
    }
}
