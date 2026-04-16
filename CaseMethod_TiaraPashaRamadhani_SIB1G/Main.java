package CaseMethod_TiaraPashaRamadhani_SIB1G;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StudentData studentData = new StudentData();
        studentData.listStudent = new Student[3];

        BookData bookData = new BookData();
        bookData.listBook = new Book[4];

        BookLendingData bookLendingData = new BookLendingData();
        bookLendingData.listBookLending = new BookLending[5];

        studentData.add(new Student("22001", "Andi", "Informatics Engineering"));
        studentData.add(new Student("22002", "Budi", "Information Engineering"));
        studentData.add(new Student("22003", "Image", "Business Information Systems"));

        bookData.add(new Book("B001", "Algorithm", 2020));
        bookData.add(new Book("B002", "Database", 2019));
        bookData.add(new Book("B003", "Programming", 2021));
        bookData.add(new Book("B004", "Physics", 2024));

        BookLending lending1 = new BookLending(studentData.listStudent[0], bookData.listBook[0], 7, 5);
        lending1.calculateFine();
        bookLendingData.add(lending1);

        BookLending lending2 = new BookLending(studentData.listStudent[1], bookData.listBook[1], 3, 5);
        lending2.calculateFine();
        bookLendingData.add(lending2);

        BookLending lending3 = new BookLending(studentData.listStudent[2], bookData.listBook[2], 10, 5);
        lending3.calculateFine();
        bookLendingData.add(lending3);

        BookLending lending4 = new BookLending(studentData.listStudent[2], bookData.listBook[3], 6, 5);
        lending4.calculateFine();
        bookLendingData.add(lending4);

        BookLending lending5 = new BookLending(studentData.listStudent[0], bookData.listBook[1], 4, 5);
        lending5.calculateFine();
        bookLendingData.add(lending5);

        int select;
        do {
            System.out.println("\n=== JTI LIBRARY BORROWING SYSTEM ===");
            System.out.println("1. View Students");
            System.out.println("2. View Books");
            System.out.println("3. View Borrowings");
            System.out.println("4. Sort by Fines");
            System.out.println("5. Search by Student ID");
            System.out.println("0. Exit");
            System.out.print("Select: ");
            select = scan.nextInt();

            switch (select) {
                case 1:
                    studentData.print();
                    break;
                case 2:
                    bookData.print();
                    break;
                case 3:
                    bookLendingData.print();
                    break;
                case 4:
                    bookLendingData.sortFine();
                    System.out.println("Sorted by fines:");
                    bookLendingData.print();
                    bookLendingData.count();
                    break;
                case 5:
                    System.out.print("Enter Student ID to search: ");
                    String studentId = scan.next();
                    bookLendingData.sortStudent();   
                    int book = bookLendingData.FindBinarySearch(studentId, 0, bookLendingData.idx - 1);
                    bookLendingData.showData(studentId, book);
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid selection. Please try again.");
            }
        } while (select != 0);
    }
}
