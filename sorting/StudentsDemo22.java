package sorting;

import java.util.Scanner;

public class StudentsDemo22 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        TopStudents22 list = new TopStudents22();

        System.out.print("Input number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));

            System.out.print("NIM: ");
            String nim = sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Class: ");
            String cls = sc.nextLine();

            System.out.print("GPA: ");
            double gpa = sc.nextDouble();
            sc.nextLine();

            Students22 std = new Students22(nim, name, cls, gpa);
            list.add(std);
        }

        System.out.println("\nBefore Sorting:");
        list.print();

        list.bubbleSort();

        System.out.println("\nAfter Sorting:");
        list.print();

        list.selectionSort();
        System.out.println("\nSorted student list (by GPA, ascending):");
        list.print();

        list.insertionSort();
        System.out.println("\nSorted student list (by GPA, descending):");
        list.print();
    }
}
