package doublelinkedlist;

public class skor {
    nodeSkor head;

    public void addLast(int data) {
        nodeSkor newNode = new nodeSkor(data);

        if (head == null) {
            head = newNode;
            return;
        }

        nodeSkor current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public int findMax() {
        if (head == null) {
            return -1;
        }

        int max = head.data;
        nodeSkor current = head.next;

        while (current != null) {
            if (current.data > max) {
                max = current.data;
            }
            current = current.next;
        }

        return max;
    }
}
