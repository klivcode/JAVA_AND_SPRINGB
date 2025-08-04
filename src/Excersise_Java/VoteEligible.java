package Excersise_Java;

import java.util.Scanner;

public class VoteEligible {
    static int age=18;
    public static int VoteEligibe(int userAge){
        if(userAge>=age){
            System.out.println("You are elligiblee to Vote, Your votter card is at counter number 57 got to collect it.");
        } else{
            System.out.println("Sorry Sir/Mam Your age is ");
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Enter your age to get elligilbe card");
        Scanner sc= new Scanner(System.in);
        int age=sc.nextInt();
        int cardEligible= VoteEligibe(age);
        System.out.println(cardEligible);
    }
}
