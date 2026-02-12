package Jobsheet1;

import java.util.Scanner;

public class Function {
    public static int Income(int [] stock, int [] price){
        int totalIncome = 0;
        for (int i = 0; i < stock.length; i++) {
            totalIncome += stock[i] * price[i];
        }
        return totalIncome;
    }
    public static void main(String[] args) {
        int [][] stock = {{10, 5, 15, 7}, {6, 11, 9, 12}, {2, 10, 10, 5}, {5, 7, 12, 9}};
        int [] price = {75000, 50000, 60000, 10000};
        String[] florist = {"Royal Garden 1", "Royal Garden 2", "Royal Garden 3", "Royal Garden 4"};

         for (int i = 0; i < stock.length; i++) {

            int income = Income(stock[i], price);

            System.out.println(florist[i]);
            System.out.println("Income: Rp " + income);

            if (income > 1500000) {
                System.out.println("Status: Very Good");
            } else {
                System.out.println("Status: Need Evaluation");
            }

            System.out.println("----------------------------");
        }
    }
}
