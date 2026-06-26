package PraktikumUAS_TiaraPashaRamadhani_SIB1G;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    static DLLVehicle vehicleList = new DLLVehicle();
    static DLLTax taxList = new DLLTax();

    public static void main(String[] args) {
        //inisiasi isi data
        initializeVehicle();

        int choice;

        do {

            System.out.println("\n====================================");
            System.out.println(" VEHICLE TAX PAYMENT SYSTEM ");
            System.out.println("====================================");
            System.out.println("1. Show Vehicle Data");
            System.out.println("2. Pay Tax");
            System.out.println("3. Show All Transactions");
            System.out.println("4. Show Total Income");
            System.out.println("5. Sort Transactions By Name");
            System.out.println("6. Exit");
            System.out.print("Choose Menu : ");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {

                case 1:
                    vehicleList.displayVehicle();
                    break;

                case 2:
                    System.out.print("Input TNKB : ");
                    String tnkb = scan.nextLine();

                    System.out.print("Input Month Pay : ");
                    int monthPay = scan.nextInt();
                    scan.nextLine();

                    Tax tax = taxList.payTax(
                            vehicleList,
                            tnkb,
                            monthPay);

                    if (tax == null) {
                        System.out.println("Vehicle not found!");
                    } else {

                        System.out.println("========== PAYMENT SUCCESS ==========");
                        System.out.println("Code : " + tax.code);
                        System.out.println("Tax : Rp " + tax.nominal);
                        System.out.println("Fine : Rp " + tax.fine);
                        System.out.println("Total : Rp " + tax.getTotal());
                    }
                    break;

                case 3:
                    taxList.displayTransaction();
                    break;

                case 4:
                    System.out.println(
                            "Total Income : Rp "
                                    + taxList.getTotalIncome());
                    break;

                case 5:
                    taxList.sortTransaction();
                    break;

                case 6:
                    System.out.println("Program Finished");
                    break;

                default:
                    System.out.println("Invalid Menu!");
            }

        } while (choice != 6);
    }

    static void initializeVehicle() {

        vehicleList.addLast(
                new Vehicle("N1234AB", "Scoppy", 2, 125, 2021, 5));

        vehicleList.addLast(
                new Vehicle("N5678CD", "Vario", 2, 300, 2020, 7));

        vehicleList.addLast(
                new Vehicle("N1111EF", "Inova", 4, 1500, 2019, 3));

        vehicleList.addLast(
                new Vehicle("N2222GH", "BMW", 4, 3000, 2022, 8));
    }
}
