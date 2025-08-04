package Excersise_Java;

import java.util.Scanner;

public class Area_Circumference_Circle {
    static double PI=3.145;
    public static int Area(double radius){
        return (int)(radius*radius * PI);
    }

    public static int Circumference(double radius){
        return (int) (2*PI*radius);
    }

    public static void main(String[] args) {
        System.out.println("Enter the radius");
        Scanner sc=new Scanner(System.in);
        int radius=sc.nextInt();
        int result=Area(radius);
        int Circumference=Circumference(radius);
        System.out.println("The area of the circumference is: "+Circumference);
        System.out.println("The area of the circumference is: "+result);
    }
}
