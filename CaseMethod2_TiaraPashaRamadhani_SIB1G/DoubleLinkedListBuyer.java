package CaseMethod2_TiaraPashaRamadhani_SIB1G;

public class DoubleLinkedListBuyer {
    NodeBuyer head;
    NodeBuyer tail;
    int size = 0;

    DoubleLinkedListBuyer() {
        head = null;
        tail = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addLast(Buyer item) {
        if (isEmpty()) {
            head = tail = new NodeBuyer(null, item, null);
        } else {
            NodeBuyer newNode = new NodeBuyer(tail, item, null);
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    Buyer removeFirst() {
        if (isEmpty())
            return null;
        Buyer removedData = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return removedData;
    }

    
    void removeByQueueNumber(int queueNumber) {
        if (isEmpty()) {
            System.out.println("Queue is currently empty!!");
            return;
        }
        NodeBuyer current = head;
        while (current != null) {
            if (current.data.queue == queueNumber) {
                if (current == head) {
                    removeFirst();
                } else if (current == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                size--;
                return;
            }
            current = current.next;
        }
        System.out.println("Queue number not found.");
    }

    void printQueue() {
        if (isEmpty()) {
            System.out.println("Empty queue.");
            return;
        }
        System.out.println("======================================");
        System.out.println("Buyer Queue List");
        System.out.println("======================================");
        System.out.printf("%-15s %-15s %-15s\n", "Queue Number", "Name", "Phone Number");
        NodeBuyer current = head;
        while (current != null) {
            System.out.printf("%-15d %-15s %-15s\n", current.data.queue, current.data.name, current.data.mobileNumber);
            current = current.next;
        }
    }
}
