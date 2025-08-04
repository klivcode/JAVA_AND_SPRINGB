package Excersise_Java;

import java.util.Scanner;

public class HighestAmong {
    public static int HighestAmongThree(int a, int b, int c){
        if(a>b && a>c){
            System.out.println(" Number 1 is Greater");
        }
        else if( b>a && b>c){
            System.out.println(" Number 2 is Greater");
        }
        else{
            System.out.println(" Number 3 is Greater");
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Enter the Three number num1, num2 and num3");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        HighestAmongThree(num1,num2,num3);
    }
}
