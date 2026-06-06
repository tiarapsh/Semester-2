package queueExercise;

import java.util.Scanner;

public class Latihan1Main {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        Latihan2 queue = new Latihan2(5);
        int input;
        do {
            System.out.print("Input pilihan:\n1. Enqueue\n2. Print Queue\n3. Keluar\nPilih: ");
            input = scan.nextInt();
            switch (input) {
                case 1:
                    System.out.print("Masukkan data: ");
                    int data = scan.nextInt();
                    queue.enqueue(data);
                    break;
                case 2:
                    queue.print();
                    break;
                case 3:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (input != 3);
    }
}
