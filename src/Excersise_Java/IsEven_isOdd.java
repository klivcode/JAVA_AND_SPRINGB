package Excersise_Java;

public class IsEven_isOdd {
    Boolean isEven(int a){
        if(a%2==0){
            System.out.println("Even");
            return true;
        }
        else {
            System.out.println("Odd");
            return false;
        }
    }


    public static void main(String[] args) {
        IsEven_isOdd obj = new IsEven_isOdd();
        obj.isEven(2);
    }
}
