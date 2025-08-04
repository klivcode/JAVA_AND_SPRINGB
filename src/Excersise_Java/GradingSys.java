package Excersise_Java;

public class GradingSys {
    static int GradingCheck(int marks)
    {
        if(marks>90 && marks<=100)
        {
            System.out.println("Grade AA");
        } else if (marks>80 && marks <=90) {
            System.out.println("Grade AB");

        } else if (marks>70 && marks<=80) {
            System.out.println("Grade BB");

        } else if (marks>60 && marks<=70) {
            System.out.println("Grade BC");

        } else if (marks>50 && marks<=60) {
            System.out.println("Grade CD");

        } else if (marks>40 && marks<=50) {
            System.out.println("Grade DD");

        }
        else {
            System.out.println("Fail");
        }
        return marks;
    }

    public static void main(String[] args) {
        GradingSys gs = new GradingSys();
        System.out.println(gs.GradingCheck(90));
    }
}
