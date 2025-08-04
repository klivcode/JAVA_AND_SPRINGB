package FramworkCollection_Excersise;

import java.util.ArrayList;

public class SearchElementInArrayList {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        String searchColor="red";
        if(colors.contains(searchColor)){
            System.out.println("color found");
        }
        else{
            System.out.println("color not found");
        }

    }
}
