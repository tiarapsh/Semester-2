package doublelinkedlist;

public class mainGerbong2 {
    public static void main(String[] args) {
        gerbong2 list = new gerbong2();
        list.insertFront("C");
        list.insertFront("B");

        list.insertFront("A");

        System.out.print("Isi rangkaian gerbong: ");
        list.printList();

    }
}
