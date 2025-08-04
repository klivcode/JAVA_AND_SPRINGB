package Excersise_Java;

public class VowelCheck_AndCount {

    // Method to check if a single character is a vowel
    static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }

    // Method to count vowels in a given string
    static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (isVowel(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String input1 = "aeiouwwwewewewe";
        String input2 = "e";

        System.out.println("Vowel count in \"" + input1 + "\": " + countVowels(input1));
        System.out.println("Is \"" + input2 + "\" a vowel? " + isVowel(input2.charAt(0)));
    }
}
