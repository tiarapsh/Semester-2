import java.util.Scanner;

public class QueueMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentQueue queue = new StudentQueue(5);

        int choice;

        do {

            System.out.println("\n=== STUDENT SERVICE QUEUE ===");
            System.out.println("1. Register Queue");
            System.out.println("2. Call Next Student");
            System.out.println("3. Show Front Queue");
            System.out.println("4. Show Rear Queue");
            System.out.println("5. Show All Queue");
            System.out.println("6. Total Queue");
            System.out.println("7. Clear Queue");
            System.out.println("0. Exit");
            System.out.print("Choose menu: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    if (queue.isFull()) {
                        System.out.println("Queue is full!");
                        break;
                    }

                    System.out.print("Input NIM: ");
                    String nim = sc.nextLine();

                    System.out.print("Input Name: ");
                    String name = sc.nextLine();

                    System.out.print("Input Class: ");
                    String cls = sc.nextLine();

                    Student std = new Student(nim, name, cls);

                    queue.enqueue(std);

                    break;

                case 2:

                    Student called = queue.dequeue();

                    if (called != null) {
                        System.out.println("Calling student:");
                        called.print();
                    }

                    break;

                case 3:
                    queue.peekFront();
                    break;

                case 4:
                    queue.peekRear();
                    break;

                case 5:
                    queue.print();
                    break;

                case 6:
                    queue.totalQueue();
                    break;

                case 7:
                    queue.clear();
                    break;

                case 0:
                    System.out.println("Program finished.");
                    break;

                default:
                    System.out.println("Invalid menu!");
            }

        } while (choice != 0);
    }
}