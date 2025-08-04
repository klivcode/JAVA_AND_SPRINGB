package Excersise_Java;

public class LengthOfNumber {
    static int numberLength(int number){
        return String.valueOf(number).length();
    }


    public static void main(String[] args) {
        LengthOfNumber l = new LengthOfNumber();
        System.out.println(l.numberLength(5));
    }
}
