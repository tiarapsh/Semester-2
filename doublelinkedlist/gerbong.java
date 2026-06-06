package doublelinkedlist;

public class gerbong {
    private nodeGerbang head;

    public gerbong() {
        head = null;
    }


    public void tambahGerbong(String kode) {
        nodeGerbang baru = new nodeGerbang(kode);
        if (head == null) {
            head = baru;
        } else {
            nodeGerbang current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = baru;
        }
    }

    public int hitungTotalGerbong() {
        int total = 0;
        nodeGerbang current = head;
        while (current != null) {
            total++;
            current = current.next;
        }
        return total;
    }

    public void tampilkanGerbong() {
        nodeGerbang current = head;
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
