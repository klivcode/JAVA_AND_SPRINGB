package Excersise_Java;

import java.util.Scanner;

public class CheckPrimeNumber {
    Boolean checkPrime(int number) {
        if (number == 1) {
            return true;
        } else if (number % 2 == 0) {
            return true;
        }
        else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        CheckPrimeNumber obj = new CheckPrimeNumber();
        System.out.println(obj.checkPrime(number));
    }
}
