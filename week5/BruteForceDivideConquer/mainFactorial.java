package week5.BruteForceDivideConquer;

import java.util.Scanner;

public class mainFactorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Input a number: ");
        int num = scan.nextInt();

        factorial fk = new factorial();
        System.out.println("The factorial of " + num + " using BF is: " + fk.factorialBF(num));
        System.out.println("The factorial of " + num + " using DC is: " + fk.factorialDC(num));
    }
    
}
