package FramworkCollection_Excersise;

import java.util.ArrayList;
import java.util.Scanner;

public class RetrveElementAtSpecidiedIndex {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("blue");
        colors.add("red");
        colors.add("green");


//        int index=1;
        System.out.println("Enter the index");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        String color=colors.get(index);
        System.out.println("color:"+color);
    }
}
