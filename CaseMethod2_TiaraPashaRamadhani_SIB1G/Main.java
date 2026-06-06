package CaseMethod2_TiaraPashaRamadhani_SIB1G;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int menu;
        int queueCounter = 1;
        int number = 0;
        DoubleLinkedListBuyer buyerList = new DoubleLinkedListBuyer();
        DoubleLinkedListOrder orderList = new DoubleLinkedListOrder();

        do {
            System.out.println("=========================\nROYAL DELISH QUEUE SYSTEMS\n=========================");
            System.out.println("1. Add Queue");
            System.out.println("2. Print Queue");
            System.out.println("3. Remove Queue and Messages");
            System.out.println("4. Order Report");
            System.out.println("0. Exit");
            System.out.print("Select Menu: ");
            menu = scan.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("Buyer Name: ");
                    String BuyerName = scan.next();
                    System.out.print("Phone Number: ");
                    String mobileNumber = scan.next();
                    buyerList.addLast(new Buyer(queueCounter, BuyerName, mobileNumber));
                    System.out.println("The queue has been successfully added with the number: " + queueCounter);
                    queueCounter++;
                    break;
                case 2:
                    buyerList.printQueue();
                    break;
                case 3:
                    Buyer calledBuyer = buyerList.removeFirst(); 
                    if (calledBuyer != null) {
                        // System.out.println("Processing order for Buyer: " + calledBuyer.getName()); 

                        System.out.print("Order Code: ");
                        int code = scan.nextInt();
                        scan.nextLine(); 

                        System.out.print("Order Name: ");
                        String orderName = scan.nextLine();

                        System.out.print("Price per item: ");
                        int price = scan.nextInt();

                        System.out.print("How many you want to buy: ");
                        int many = scan.nextInt();
                        scan.nextLine(); 

                        int totalPrice = price * many;
                        System.out.println("Total Price: " + totalPrice);

                        orderList.addLast(new Order(orderName, code, totalPrice));
                        // System.out.println("Order successfully placed for " +() + "!");
                    } else {
                        System.out.println("No buyers in the queue.");
                    }
                    break;
                case 4:
                    orderList.printOrders();
                    break;
                case 0:
                    break;
                default:
                    break;
            }
        } while (menu != 0);

    }
}
