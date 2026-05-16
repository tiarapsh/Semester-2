package P13;

public class DoubleLinkedLists {
    Node head;
    Node tail;

    DoubleLinkedLists() {
        head = null;
        tail = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(Student data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    void addLast(Student data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void insertAfter(String key, Student data) {
        Node newNode = new Node(data);
        Node temp = head;

        while (temp != null) {

            if (temp.data.nim.equalsIgnoreCase(key)) {

                if (temp == tail) {
                    addLast(data);
                } else {
                    newNode.next = temp.next;
                    newNode.prev = temp;
                    temp.next.prev = newNode;
                    temp.next = newNode;
                }

                return;
            }

            temp = temp.next;
        }

        System.out.println("Insertion failed. Data (" + key + ") not found!!");
    }

    void removeFirst() {

        if (isEmpty()) {
            System.out.println("Double linked list is currently empty!!");

        } else if (head == tail) {
            head = tail = null;

        } else {
            head = head.next;
            head.prev = null;
        }
    }

    void removeLast() {

        if (isEmpty()) {
            System.out.println("Double linked list is currently empty!!");

        } else if (head.next == null) {
            head = null;

        } else {

            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.prev.next = null;
        }
    }

    void remove(int index) {

    if (isEmpty()) {
        System.out.println("Double linked list is currently empty!!");
        return;
    }

    if (index < 0) {
        System.out.println("Index cannot be negative!");
        return;
    }

    Node temp = head;
    int i = 0;

    while (temp != null && i < index) {
        temp = temp.next;
        i++;
    }

    if (temp == null) {
        System.out.println("Index exceeds linked list size!");
        return;
    }

    if (index == 0) {
        removeFirst();

    } else if (temp == tail) {
        removeLast();

    } else {
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }
}

    void print() {
        if (!isEmpty()) {

            Node temp = head;

            while (temp != null) {
                temp.data.print();
                temp = temp.next;
            }

            System.out.println("");

        } else {
            System.out.println("Double linked list is currently empty!!");
        }
    }
}
