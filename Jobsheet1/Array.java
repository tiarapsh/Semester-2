package Jobsheet1;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("============================");
        System.out.println("Calculate IP Semester");
        System.out.println("============================");

        String[] course = { "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking and Problem Solving",
                "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja" };
        int[] sks = { 2, 2, 2, 2, 2, 2, 3, 2 };
        double[] score = new double[course.length];
        String[] grade = new String[course.length];
        double[] creditWeight = new double[course.length];
        double totalCreditWeight = 0;
        int totalSks = 0;

        for (int i = 0; i < course.length; i++) {
            System.out.print("Enter grade for " + course[i] + ": ");
            score[i] = scan.nextDouble();

            if (score[i] > 80 && score[i] <= 100) {
                grade[i] = "A";
                creditWeight[i] = 4.0 * sks[i];
            } else if (score[i] > 73 && score[i] <= 80) {
                grade[i] = "B+";
                creditWeight[i] = 3.5 * sks[i];
            } else if (score[i] > 65 && score[i] <= 73) {
                grade[i] = "B";
                creditWeight[i] = 3.0 * sks[i];
            } else if (score[i] > 60 && score[i] <= 65) {
                grade[i] = "C+";
                creditWeight[i] = 2.5 * sks[i];
            } else if (score[i] > 50 && score[i] <= 60) {
                grade[i] = "C";
                creditWeight[i] = 2.0 * sks[i];
            } else if (score[i] > 39 && score[i] <= 50) {
                grade[i] = "D";
                creditWeight[i] = 1.0 * sks[i];
            } else if (score[i] <= 39) {
                grade[i] = "E";
                creditWeight[i] = 0.0 * sks[i];
            }

            totalCreditWeight += creditWeight[i];
            totalSks += sks[i];
        }
        System.out.println("============================");
        System.out.println("Result Grade Semester");
        System.out.println("============================");

         System.out.printf("%-40s %-10s %-10s\n", 
                          "Mata Kuliah", "Grade", "Credit Weight");

        for (int i = 0; i < course.length; i++) {
            System.out.printf("%-40s %-10s %-10.2f\n", course[i], grade[i], creditWeight[i]);
        }
        System.out.println("============================");
        double ipSemester = totalCreditWeight / totalSks;

        System.out.printf("IP: %.2f\n", ipSemester);

    }
}
