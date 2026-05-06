package P1Jobsheet11;

import java.util.Scanner;

public class queueMain {
     static void menu(){
        System.out.println("Available menu:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("=======================");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Input max data: ");
        int n = sc.nextInt();

        queue Q = new queue(n);
        int choice;

        do {
            menu();
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Input new data: ");
                    int data = sc.nextInt();
                    Q.enqueue(data);
                    break;
                case 2:
                    int out = Q.dequeue();
                    if(out != -1){
                        System.out.println("Removed: " + out);
                    }
                    break;
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
            }
        } while(choice >= 1 && choice <= 5);
    }
}
