package Class_Excercise;

import java.util.Scanner;

public class Recatangle {




    static  int getArea(int len, int bred)
    {
        return (len * bred) ;
    }
    static int getDim(){
        System.out.println("Enter Length and Breadth");
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int bred = scanner.nextInt();
        int res=getArea(len, bred);
        return res;

    }

    public static void main(String[] args) {
        Recatangle recatangle = new Recatangle();
        int fin= recatangle.getDim();
        System.out.println(fin);
    }



}
