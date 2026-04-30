package Jobsheet10;

import java.util.Scanner;

public class studentDemo22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        studentAssignmentStack stack = new studentAssignmentStack(5);

        
        int choose;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Collect Assignment");
            System.out.println("2. Grade Assignment");
            System.out.println("3. View Top Assignment");
            System.out.println("4. View All Assignments");
            System.out.print("Choose: ");
            choose = scan.nextInt();
            scan.nextLine();
            switch (choose) {
                case 1:
                    System.out.print("Name:");
                    String name = scan.nextLine();
                    System.out.print("NIM:");
                    String nim = scan.nextLine();
                    System.out.print("Class:");
                    String className = scan.nextLine();
                    student22 student = new student22(nim, name, className);
                    stack.push(student);
                    System.out.printf("Assignment from %s collected!\n", name);
                    break;
                case 2:
                    student22 graded = stack.pop();
                    if (graded != null) {
                        System.out.println("Grade for " + graded.name + ":");
                        System.out.print("Enter grade (0-100):");
                        int grade = scan.nextInt();
                        graded.grading(grade);
                        System.out.printf("Assignment from %s graded with %d!\n", graded.name, grade);
                        String binary = stack.convertToBinary(grade);
                        System.out.printf("Assignment grade in binary is %s\n", binary);
                        break;
                    }
                case 3:
                    student22 look = stack.peek();
                    if (look != null) {
                        System.out.println("Last collected assignment is: " + look.name);
                    }
                    break;
                case 4:
                    System.out.println("All collected assignments");
                    System.out.println("Total assignments: " + stack.count());
                    System.out.println("Name\tNIM\tClass");
                    stack.print();
                    break;
                case 5:
                    student22 first = stack.getFirst();
                    if (first != null) {
                        System.out.println("First student: " + first.name);
                    }
                    break;
                default:
                    System.out.println("Not a valid option!");
            }
        } while (choose >= 1 && choose <= 4);
    }
}
