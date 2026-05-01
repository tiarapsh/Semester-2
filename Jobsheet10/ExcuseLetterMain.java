package Jobsheet10;

import java.util.Scanner;

public class ExcuseLetterMain {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ExcuseLetterStack stack = new ExcuseLetterStack(5);

        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Submit Excuse Letter");
            System.out.println("2. Process Excuse Letter");
            System.out.println("3. View Latest Excuse Letter");
            System.out.println("4. Search for Letter");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    String id = scan.nextLine();
                    System.out.print("Name: ");
                    String name = scan.nextLine();
                    System.out.print("Class: ");
                    String cls = scan.nextLine();
                    System.out.print("Type (S/I): ");
                    char type = scan.next().charAt(0);
                    System.out.print("Duration (days): ");
                    int duration = scan.nextInt();
                    scan.nextLine();

                    ExcuseLetter22 e = new ExcuseLetter22(id, name, cls, type, duration);
                    stack.push(e);
                    break;

                case 2:
                    ExcuseLetter22 processed = stack.pop();
                    if (processed != null) {
                        System.out.println("Processing latest letter:");
                        stack.printDetail(processed);
                    }
                    break;

                case 3:
                    ExcuseLetter22 latest = stack.peek();
                    if (latest != null) {
                        System.out.println("Latest letter:");
                        stack.printDetail(latest);
                    } else {
                        System.out.println("No data!");
                    }
                    break;

                case 4:
                    System.out.print("Enter name to search: ");
                    String search = scan.nextLine();
                    stack.searchByName(search);
                    break;
            }

        } while (choice != 0);
    }
}
