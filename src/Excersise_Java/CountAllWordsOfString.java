package Excersise_Java;

public class CountAllWordsOfString {

    static int countAllwords(String str) {
       String[] words = str.trim().split(" ");
       return words.length;
    }

    public static void main(String[] args) {
        System.out.println(countAllwords("I want to be a Software Engineer"));
    }
}
