package queueExercise;

import java.util.Scanner;

public class Latihan3Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input max queue: ");
        int max = scan.nextInt();
        Latihan3 queue = new Latihan3(max);

        int input;

        do {
            System.out.print("Input pilihan:\n1. Enqueue\n2. Peek\n3. Keluar\nPilih: ");
            input = scan.nextInt();
            switch (input) {
                case 1:
                    System.out.print("Masukkan data: ");
                    int data = scan.nextInt();
                    queue.enqueue(data);
                    break;
                case 2:
                    queue.peek();
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
