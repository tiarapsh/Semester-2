package Jobsheet1;

import java.util.Scanner;

public class CarLicense {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char Code [] = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        char City [][]=  {{'B','A','N','T','E','N'}, {'J','A','K','A','R','T','A'}, {'B','A','N','D','U','N','G'}, {'C','I','R','E','B','O','N'}, {'B','O','G','O','R'}, {'P','E','K','A','L','O','N','G','A','N'}, {'S','E','M','A','R','A','N','G'}, {'S','U','R','A','B','A','Y','A'}, {'M','A','L','A','N','G'}, {'T','E','G','A','L'}};

        System.out.print("Input Car License Code: ");
        String license = scan.nextLine().toUpperCase();
        char licenseCode = license.charAt(0);

        boolean found = false;
        for (int i = 0; i < Code.length; i++) {
            if (licenseCode == Code[i]) {
                found = true;
                System.out.print("City: ");
                for (int j = 0; j < City[i].length; j++) {
                    System.out.print(City[i][j]);
                }
                System.out.println();
                break;
            }
        }
        if (!found) {
            System.out.println("Invalid Code.");
        }

    }
}
