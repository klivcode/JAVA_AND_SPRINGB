package Excersise_Java;

import java.sql.SQLOutput;

public class MinMaxNUmber {
    static int MaxAmongNumber(int a , int b, int c){
        if(a>b && a>c){
            System.out.println(a+"Greater");
        }
        else if(b>a && b>c){
            System.out.println(b+"Greater");
        }
        else{
            System.out.println(c+"Greater");
        }
        return 0;
    }

    static int MinAmongNumber(int a , int b, int c){
        if(a<b && a<c){
            System.out.println(a+"Smaller");
        }
        else if(b<a && b<c){
            System.out.println(b+"Smaller");
        }
        else{
            System.out.println(c+"Smaller");
        }
        return 0;
    }

    public static void main(String[] args) {
        MinMaxNUmber m = new MinMaxNUmber();
        System.out.println(m.MinAmongNumber(5,8,6));
        System.out.println(m.MaxAmongNumber(5,8,6));
    }
}
