package Quiz1_TiaraPashaRamadhani_SIB1G;

import java.util.Scanner;

import Praktikum03.Task.Dosen22;

public class AccessoriesMain22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input number of accessories: ");
        int numberOfAccessories = Integer.parseInt(scan.nextLine());

        Accessories22[] arrayOfAccessories22 = new Accessories22[numberOfAccessories];
          for (int i = 0; i < numberOfAccessories; i++) {
            System.out.println("\nInput sold data accessories No-" + (i + 1));
            System.out.print("Name         : ");
            String name = scan.nextLine();
            System.out.print("1. Necklace\n2. Bracelet\n3. Earring\nCategory     : ");
            String category = scan.nextLine();
            System.out.print("Price        : ");
            int price = Integer.parseInt(scan.nextLine());
            System.out.print("Sold         : ");
            int sold = Integer.parseInt(scan.nextLine());
            System.out.print("Stock        : ");
            int stock = Integer.parseInt(scan.nextLine());
            
            arrayOfAccessories22[i] = new Accessories22(name, stock, price, sold, category);
        }

        boolean running = true;
        while (running){
            System.out.println("\n======= MENU DATA ACCESSORIES =======");
            System.out.println("1. Show all data accessories");
            System.out.println("2. Total sales of accessories");
            System.out.println("3. Check stock of accessories");
            System.out.println("4. Search the cheapest accessories");
            System.out.println("5. Exit");
            System.out.println("Choose menu (1-5): ");
            int menu = scan.nextInt();
            switch (menu){
                case 1:
                    dataAccessories22.display(arrayOfAccessories22);
                    break;
                case 2:
                    int totalSales = dataAccessories22.calculateTotalSales(arrayOfAccessories22);
                    System.out.println("Total sales of accessories: " + totalSales);
                    break;
                case 3:
                    dataAccessories22.checkStock(arrayOfAccessories22);
                    break;
                case 4:
                    dataAccessories22.searchCheapestAccessoriss(arrayOfAccessories22);
                    break;
                case 5:
                    running = false;
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid menu choice");
            }
        }
    }
}
