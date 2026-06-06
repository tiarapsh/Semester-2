package doublelinkedlist;

public class mainApp {
     public static void main(String[] args) {
        app history = new app();

        history.addLast("Rock");
        history.addLast("Jazz");
        history.addLast("Pop");

        System.out.println("Riwayat lagu dari terakhir ke pertama:");
        history.printBackward();
    }
}
