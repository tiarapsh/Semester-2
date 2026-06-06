package doublelinkedlist;

public class gerbong2 {
     private nodeGerbang2 head;

    public gerbong2() {
        head = null;
    }

    public void tambahGerbang(String kode) {
        nodeGerbang2 newNode = new nodeGerbang2(kode);
        if (head == null) {
            head = newNode;
        } else {
            nodeGerbang2 current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

     public void insertFront(String data) {
        nodeGerbang2 newNode = new nodeGerbang2(data);
        newNode.next = head;
        head = newNode;
    }

     public void printList() {
        nodeGerbang2 current = head;

        while (current != null) {
            System.out.print(current.kode);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }
}
