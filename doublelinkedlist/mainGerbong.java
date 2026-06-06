package doublelinkedlist;

public class mainGerbong {
       public static void main(String[] args) {
        gerbong daftar = new gerbong();
        daftar.tambahGerbong("A");
        daftar.tambahGerbong("B");
        daftar.tambahGerbong("C");

        System.out.print("Rangkaian gerbong: ");
        daftar.tampilkanGerbong();
        System.out.println("Total gerbong: " + daftar.hitungTotalGerbong());
    }
}
