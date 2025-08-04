package FramworkCollection_Excersise;

import java.util.TreeSet;

public class GetElementLessthanOrEqualInTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> colors1= new TreeSet<>();
        colors1.add(5);
        colors1.add(8);
        colors1.add(6);
        colors1.add(7);
        colors1.add(9);
        colors1.add(10);

        int givenNum=5;
        Integer result=colors1.floor(givenNum);
        System.out.println(result);
    }
}
