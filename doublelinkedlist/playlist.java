package doublelinkedlist;

public class playlist {
    nodePlaylist head;

    public void addLast(String data) {
        nodePlaylist newNode = new nodePlaylist(data);

        if (head == null) {
            head = newNode;
            return;
        }

        nodePlaylist current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public void deleteLast() {
        if (head == null) {
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        nodePlaylist current = head;

        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;
    }

    public void printList() {
        nodePlaylist current = head;

        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }
}
