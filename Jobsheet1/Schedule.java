package Jobsheet1;

import java.util.Scanner;

public class Schedule {
    static Scanner scan = new Scanner(System.in);
    static String[][] schedule = new String[100][4];
    static int i = 0;

    public static void addSchedule() {
         System.out.print("Course Name : ");
        String course = scan.nextLine();

        System.out.print("Room : ");
        String room = scan.nextLine();

        System.out.print("Day : ");
        String day = scan.nextLine();

        System.out.print("Time : ");
        String time = scan.nextLine();


        schedule[i][0] = course;
        schedule[i][3] = room;
        schedule[i][1] = day;
        schedule[i][2] = time;
        i++;
        
        System.out.println("Schedule added successfully!");
    }

    public static void displaySchedule() {
        System.out.println("Lecture Schedules:");
        System.out.printf("%-30s %-15s %-10s %-10s\n", "Course", "Day", "Time", "Room");
        for (int j = 0; j < i; j++) {
            System.out.printf("%-30s %-15s %-10s %-10s\n", schedule[j][0], schedule[j][1], schedule[j][2], schedule[j][3]);
        }
    }

    public static void searchByDay() {
        System.out.print("Enter Day to Search:");
        String searchDay = scan.nextLine();
        System.out.println("Schedules on " + searchDay + ":");
        System.out.printf("%-30s %-15s %-10s %-10s\n", "Course", "Day", "Time", "Room");
        for (int j = 0; j < i; j++) {
            if (schedule[j][1].equalsIgnoreCase(searchDay)) {
                System.out.printf("%-30s %-15s %-10s %-10s\n", schedule[j][0], schedule[j][1], schedule[j][2], schedule[j][3]);
            }
        }
    }

    public static void searchByCourse() {
        System.out.print("Enter Course to Search:");
        String searchCourse = scan.nextLine();
        System.out.println("Schedules for " + searchCourse + ":");
        System.out.printf("%-30s %-15s %-10s %-10s\n", "Course", "Day", "Time", "Room");
        for (int j = 0; j < i; j++) {
            if (schedule[j][0].equalsIgnoreCase(searchCourse)) {
                System.out.printf("%-30s %-15s %-10s %-10s\n", schedule[j][0], schedule[j][1], schedule[j][2], schedule[j][3]);
            }
        }
    }

    public static void main(String[] args) {
        int option = 0;
        while (option != 5) {
            System.out.println("Schedule Menu:");
            System.out.println("1. Add Lecture Schedule");
            System.out.println("2. Display Lecture Schedule");
            System.out.println("3. Search Lecture Schedules by Days");
            System.out.println("4. Search Lecture Schedules by Course");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            option = scan.nextInt();
            scan.nextLine(); 

            switch (option ) {
                case 1:
                    addSchedule();
                    break;
                case 2:
                    displaySchedule();
                    break;
                case 3:
                    searchByDay();
                    break;
                case 4:
                    searchByCourse();
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    break;
            }

        }
    }
    
}
