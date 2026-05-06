package P1Jobsheet11;

import java.util.Scanner;

public class studentQueueMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        studentQueue q = new studentQueue(5);
        int choice;

        do {
            System.out.println("==== Academic Service Menu ====");
            System.out.println("1.Enqueue Student");
            System.out.println("2.Dequeue Student");
            System.out.println("3.Display Front");
            System.out.println("4.Display All");
            System.out.println("5.Queue Size");
            System.out.println("6.Rear");
            System.out.println("0.Exit");
            System.out.print("Choose a menu: ");
            choice = sc.nextInt(); sc.nextLine();

            switch(choice){
                case 1:
                    System.out.print("NIM: "); String nim = sc.nextLine();
                    System.out.print("Name: "); String name = sc.nextLine();
                    System.out.print("Study Program: "); String prodi = sc.nextLine();
                    System.out.print("Class: "); String cls = sc.nextLine();
                    q.enqueue(new student(nim,name,prodi,cls));
                    break;
                case 2:
                    student s = q.dequeue();
                    if(s != null) s.print();
                    break;
                case 3:
                    q.peek();
                    break;
                case 4:
                    q.print();
                    break;
                case 5:
                    System.out.println("Size: " + q.size);
                    break;
                case 6:
                    q.viewRear();
                    break;
            }
        } while(choice != 0);
    }
}
