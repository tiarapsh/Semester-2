package week5;

import java.util.Scanner;

public class studentMain {
    public static void main(String[] args) {
           Scanner scan = new Scanner(System.in);

        System.out.print("Input number of students: ");
        int n = scan.nextInt();

        studentScore sc = new studentScore(n);

        for(int i = 0; i < n; i++){
            System.out.print("Input UTS score for student " + (i+1) + ": ");
            sc.uts[i] = scan.nextInt();

            System.out.print("Input UAS score for student " + (i+1) + ": ");
            sc.uas[i] = scan.nextInt();
        }

        System.out.println("\nHighest UTS (DC): " + sc.maxUTS(sc.uts, 0, n-1));
        System.out.println("Lowest UTS (DC): " + sc.minUTS(sc.uts, 0, n-1));
        System.out.println("Average UAS (BF): " + sc.avgUAS());
    }
}
