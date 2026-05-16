package P13;

public class DoubleLinkedListsMain {

    public static void main(String[] args) {

        DoubleLinkedLists dll = new DoubleLinkedLists();

        // kondisi awal
        dll.print();

        // addFirst
        dll.addFirst(new Student("111", "Anton", "TI-1I", 3.57));
        dll.print();

        // addLast
        dll.addLast(new Student("112", "Prabowo", "TI-1I", 3.7));
        dll.print();

        // addFirst lagi
        dll.addFirst(new Student("113", "Herco", "TI-1I", 3.89));
        dll.print();

        // insertAfter
        dll.insertAfter("111",
                new Student("114", "Rizki", "TI-1I", 3.8));
        dll.print();

        dll.insertAfter("112",
                new Student("115", "Hanzel", "TI-1I", 3.6));
        dll.print();

        dll.insertAfter("120",
                new Student("116", "Eiyu", "TI-1I", 3.4));
        dll.print();

        // removeFirst
        dll.removeFirst();
        dll.print();

        // removeLast
        dll.removeLast();
        dll.print();

        // remove index
        dll.remove(1);
        dll.print();
    }
}