package FramworkCollection_Excersise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExtractPortion {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("orange");
        colors.add("yellow");
        colors.add("purple");

        System.out.println("Enter the from where to where (1to4) ");
        Scanner sc = new Scanner(System.in);
        int from = sc.nextInt();
        int to = sc.nextInt();

        List<String> subList = colors.subList(from, to);
        System.out.println(subList);
    }
}
