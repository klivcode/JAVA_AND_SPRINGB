package FramworkCollection_Excersise;

import java.util.ArrayList;

public class IterateThroughArraylist {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("blue");
        colors.add("red");
        colors.add("green");

        // using for loop
        for(int i=0;i<colors.size();i++){
            System.out.println(colors.get(i));
        }
        //Enhanced for loop
        for(String color:colors){
            System.out.println(color);
        }
        // forEach
        System.out.println("Using For each");
        colors.forEach(System.out::println);
    }
}
