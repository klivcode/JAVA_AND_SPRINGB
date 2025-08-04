package FramworkCollection_Excersise;

import java.util.TreeSet;

public class PollFIrstTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet=new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(5);

        // First Retrive and Remove the First Element done using PollFirst and PollLast

        Integer first= treeSet.pollFirst();
        System.out.println(first);
    }
}
