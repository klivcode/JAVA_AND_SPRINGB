package FramworkCollection_Excersise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListArrayConverz {
    public static void main(String[] args) {
        // Arraylist to Array
        ArrayList<String> list = new ArrayList<String>();
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Orange");

        //Arraylist to array
        String[] array = list.toArray(new String[0]);
        //Arraylist to array
        Object[] arrays=list.toArray();

        //Array to Arraylist
        String[] arryass={"Red","Blue","Green","Orange"};

        // method 1 Array to Arraylist

        ArrayList<String > arrayList1=new ArrayList<>(Arrays.asList(arryass));

        // method 2 using collections
        ArrayList<String > arrayList2=new ArrayList<>();
        Collections.addAll(arrayList2,arryass);

    }
}
