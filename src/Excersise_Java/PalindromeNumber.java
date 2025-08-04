package Excersise_Java;

public class PalindromeNumber {
    static boolean isPalindrome(int number) {
        if (number == 0 || number == 1) {
            return true;
        }
        if (number % 10 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        PalindromeNumber p = new PalindromeNumber();
        System.out.println(p.isPalindrome(10));
    }
}
