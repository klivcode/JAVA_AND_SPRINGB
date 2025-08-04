package Excersise_Java;

public class MultiplicationNUmber {

    public static int MultiplicationNUmber(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.println(number +"*"+i+"="+number * i);
        }
        return number;
    }

    public static void main(String[] args) {
        MultiplicationNUmber obj = new MultiplicationNUmber();
        obj.MultiplicationNUmber(10);

    }
}
