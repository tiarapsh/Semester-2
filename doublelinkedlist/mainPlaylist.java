package doublelinkedlist;

public class mainPlaylist {
    public static void main(String[] args) {
        playlist list = new playlist();
        list.addLast("Lagu 1");
        list.addLast("Lagu 2");
        list.addLast("Lagu 3");

        System.out.println("Playlist sebelum dihapus:");
        list.printList();

        list.deleteLast();

        System.out.println("\nPlaylist setelah dihapus:");
        list.printList();
    }
 
}
