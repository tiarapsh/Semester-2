package Jobsheet1;

import java.util.Scanner;

public class Selection {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String score =" ";
        String status =" ";

        System.out.println("Student Score Calculation ");
        System.out.println("============================");
        System.out.print("Input Assignment Score:");
        int assignment = scan.nextInt();
        System.out.print("Input Quiz Score:");
        int quiz = scan.nextInt();
        System.out.print("Input Midterm Score:");
        int mideterm = scan.nextInt();
        System.out.print("Input Final Score:");
        int examScore = scan.nextInt();
        System.out.println("============================");
        
        if (assignment < 0 || assignment > 100 ||
            quiz < 0 || quiz > 100 ||
            mideterm < 0 || mideterm > 100 ||
            examScore < 0 || examScore > 100) {
            System.out.println("Invalid value.");
        } else {
            double finalScore= (0.2 * assignment) + (0.2 * quiz) + (0.3 * mideterm) + (0.3 * examScore);

        if (finalScore > 80 && finalScore <= 100) {
            score = "A";
        } else if (finalScore > 73 && finalScore <= 80) {
            score = "B+";
        } else if (finalScore > 65 && finalScore <= 73) {
            score = "B";
        } else if (finalScore > 60 && finalScore <= 65) {        
            score = "C+";
        } else if (finalScore > 50 && finalScore <= 60) {
            score = "C";
        } else if (finalScore > 39 && finalScore <= 50) {
            score = "D";
        } else if (finalScore <= 39) {
            score = "E";
        }

        System.out.println("Final Score :" + finalScore);
        System.out.println("Score Grade :" + score);
        
        System.out.println("============================");
        if (score == "D" || score == "E") {
            System.out.println("Sorry, You Failed");
        } else if (score == "A" || score == "B+" || score == "B" || score == "C+") {                          
            System.out.println("Congratulations! You Passed");
        }
        }
        
    }
}
