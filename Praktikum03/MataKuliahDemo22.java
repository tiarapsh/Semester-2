package Praktikum03;

import java.util.Scanner;

public class MataKuliahDemo22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan jumlah Mata Kuliah: ");
        int length = scan.nextInt();
        scan.nextLine(); 

        MataKuliah22[] arrayOfMataKuliah22 = new MataKuliah22[length];
        String kode, nama;
        int sks, jumlahJam;

        for (int i = 0; i < length; i++) {
            System.out.println("Input Data Mata Kuliah ke-" + (i + 1));
            System.out.print("Kode : ");
            kode = scan.nextLine();
            System.out.print("Nama : ");
            nama = scan.nextLine();
            System.out.print("SKS : ");
            sks = scan.nextInt();
            System.out.print("Jumlah Jam : ");
            jumlahJam = scan.nextInt();
            scan.nextLine(); 
            System.out.println("------------------------------");

            arrayOfMataKuliah22[i] = new MataKuliah22("", "", 0, 0);
            arrayOfMataKuliah22[i].addData(kode, nama, sks, jumlahJam); 
        }

        for (int i = 0; i < arrayOfMataKuliah22.length; i++) {
            System.out.println("Data Mata Kuliah ke-" + (i + 1));
            arrayOfMataKuliah22[i].printInfo(); 
        }
    }
}