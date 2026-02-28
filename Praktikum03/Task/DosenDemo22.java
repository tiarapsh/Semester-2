package Praktikum03.Task;

import java.util.Scanner;

public class DosenDemo22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input number of lecturer: ");
        int jumlah = Integer.parseInt(scan.nextLine());

        Dosen22[] arrayOfDosen22 = new Dosen22[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nInput Data Lecturer No-" + (i + 1));
            System.out.print("Code          : ");
            String code = scan.nextLine();
            System.out.print("Name          : ");
            String name = scan.nextLine();
            System.out.print("Gender (Men/Women): ");
            String gender = scan.nextLine();
            boolean jk = gender.equalsIgnoreCase("Men");
            System.out.print("Age           : ");
            int age = Integer.parseInt(scan.nextLine());
            
            arrayOfDosen22[i] = new Dosen22(code, name, jk, age);
        }

        boolean running = true;
        while (running) {
            System.out.println("\n======= MENU DATA LECTURER =======");
            System.out.println("1. Show all data lecturers");
            System.out.println("2. Total lecturer based on gender ");
            System.out.println("3. Average Age of Lecturer per Gender");
            System.out.println("4. Most old lecturer information");
            System.out.println("5. Most young lecturer information");
            System.out.println("0. Exit");
            System.out.print("Choose menu (0-5): ");
            int pilihan = Integer.parseInt(scan.nextLine());
            System.out.println("-------------------------------");

            switch (pilihan) {
                case 1:
                    dataDosen22.dataAllDosen(arrayOfDosen22);
                    break;
                case 2:
                    dataDosen22.numberOfLecturerPerGender(arrayOfDosen22);
                    break;
                case 3:
                    dataDosen22.AverageAgeOfLecturerPerGender(arrayOfDosen22);
                    break;
                case 4:
                    dataDosen22.infoDosenPalingTua(arrayOfDosen22);
                    break;
                case 5:
                    dataDosen22.infoDosenPalingMuda(arrayOfDosen22);
                    break;
                case 0:
                    running = false;
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}