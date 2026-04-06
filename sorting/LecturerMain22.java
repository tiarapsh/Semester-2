package sorting;

import java.util.Scanner;

public class LecturerMain22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LecturerData22 data = new LecturerData22();

        int menu;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Add Data");
            System.out.println("2. Display Data");
            System.out.println("3. Sort ASC (Youngest or Oldest)");
            System.out.println("4. Sort DSC (Oldest or Youngest)");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("ID: ");
                    String id = sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Gender (Male/Female): ");
                    String genderStr = sc.nextLine();
                    boolean gender = genderStr.equalsIgnoreCase("Male");

                    System.out.print("Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    Lecturer22 dsn = new Lecturer22(id, name, gender, age);
                    data.add(dsn);
                    break;

                case 2:
                    data.print();
                    break;

                case 3:
                    data.sortingASC();
                    System.out.println("Sorted ASC!");
                    data.print();
                    break;

                case 4:
                    data.sortingDSC();
                    System.out.println("Sorted DSC!");
                    data.print();
                    break;

                case 5:
                    System.out.println("Exit...");
                    break;

                default:
                    System.out.println("Invalid menu!");
            }
        } while (menu != 5);
    }
}
