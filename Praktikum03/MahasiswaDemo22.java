package Praktikum03;

public class MahasiswaDemo22 {
    public static void main(String[] args) {
        Student22 [] arrayOfStudent22 = new Student22[3];
        arrayOfStudent22[0] = new Student22();
        arrayOfStudent22[0].nim = "2444107060148";
        arrayOfStudent22[0].nama = "AGNES TITANIA KINANTI";
        arrayOfStudent22[0].kelas = "SIB-1E";
        arrayOfStudent22[0].ipk = (float) 3.75f;
        
        arrayOfStudent22[1] = new Student22();
        arrayOfStudent22[1].nim = "234107060190";
        arrayOfStudent22[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayOfStudent22[1].kelas = "TI-2A";
        arrayOfStudent22[1].ipk = (float) 3.36f;
        
        arrayOfStudent22[2] = new Student22();
        arrayOfStudent22[2].nim = "244107060129";
        arrayOfStudent22[2].nama = "DIRHAMAWAN PUTRANTO";
        arrayOfStudent22[2].kelas = "TI-2E";
        arrayOfStudent22[2].ipk = (float) 3.80f;
    
            System.out.println("NIM: " + arrayOfStudent22[0].nim);
            System.out.println("Nama: " + arrayOfStudent22[0].nama);
            System.out.println("Kelas: " + arrayOfStudent22[0].kelas);
            System.out.println("IPK: " + arrayOfStudent22[0].ipk);
            System.out.println("-------------------------------");
            System.out.println("NIM: " + arrayOfStudent22[1].nim);
            System.out.println("Nama: " + arrayOfStudent22[1].nama);
            System.out.println("Kelas: " + arrayOfStudent22[1].kelas);
            System.out.println("IPK: " + arrayOfStudent22[1].ipk);
            System.out.println("-------------------------------");
            System.out.println("NIM: " + arrayOfStudent22[2].nim);
            System.out.println("Nama: " + arrayOfStudent22[2].nama);
            System.out.println("Kelas: " + arrayOfStudent22[2].kelas);
            System.out.println("IPK: " + arrayOfStudent22[2].ipk);
            System.out.println("-------------------------------");
        }
    }

