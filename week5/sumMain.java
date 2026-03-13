package week5;

import java.util.Scanner;

public class sumMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Input element number: ");
        int elemen = scan.nextInt();

        sum sm = new sum(elemen);
        for (int i = 0; i < elemen; i++) {
            System.out.print("Input profit for " + (i + 1) + ": ");
            sm.profits[i] = scan.nextDouble();
        }
        System.out.println("Profit total using BF:" +sm.totalBF());
        System.out.println("Profit total using DC:" +sm.totalDC(sm.profits, 0, elemen - 1));
    }
}
