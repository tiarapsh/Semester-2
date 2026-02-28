package Praktikum03;

import java.util.Scanner;

public class MahasiswaDemo22 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       Student22 [] arrayOfStudent22 = new Student22[3];
       String dummy;

       for (int i = 0; i < arrayOfStudent22.length; i++) {
           arrayOfStudent22[i] = new Student22();
           System.out.println("Input Data Mahasiswa ke-" + (i+1));
           System.out.print("NIM : ");
           arrayOfStudent22[i].nim = scan.nextLine();
           System.out.print("Nama : ");
           arrayOfStudent22[i].nama = scan.nextLine();
           System.out.print("Kelas : ");
           arrayOfStudent22[i].kelas = scan.nextLine();
           System.out.print("IPK : ");
           arrayOfStudent22[i].ipk = scan.nextFloat();
           dummy = scan.nextLine();
           System.out.println("------------------------------");
       }

       for (int i = 0; i < arrayOfStudent22.length; i++) {
    System.out.println("Data Mahasiswa ke-" + (i + 1));
    arrayOfStudent22[i].printInfo(); 
    System.out.println("------------------------------");
}

    }
}

