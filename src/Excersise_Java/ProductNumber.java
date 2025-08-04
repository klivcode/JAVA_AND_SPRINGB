package Excersise_Java;

import java.util.Scanner;

public class ProductNumber {

    public static int Product(int a, int b)
    {
        return a*b;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number for product");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int Product = Product(a,b);
        System.out.println("Product is "+ Product);
    }
}
