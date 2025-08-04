package FramworkCollection_Excersise;

import java.util.Scanner;
import java.util.TreeSet;

public class HigherElementTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> colors1= new TreeSet<>();
        colors1.add(5);
        colors1.add(8);
        colors1.add(6);
        colors1.add(7);
        colors1.add(9);
        colors1.add(10);

        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer result=colors1.higher(n);
        System.out.println(result);
    }
}
