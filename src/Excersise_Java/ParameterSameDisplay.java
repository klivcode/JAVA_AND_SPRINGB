package Excersise_Java;

public class ParameterSameDisplay {
    Boolean  IsSameNum(int a, int b) {
        if(a==b){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        ParameterSameDisplay p = new ParameterSameDisplay();
        System.out.println(p.IsSameNum(5,8));
    }
}
