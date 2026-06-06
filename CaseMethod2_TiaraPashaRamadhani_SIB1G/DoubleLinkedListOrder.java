package CaseMethod2_TiaraPashaRamadhani_SIB1G;

public class DoubleLinkedListOrder {
    NodeOrder head;
    NodeOrder tail;
    int size = 0;
    int totalPrice;

    DoubleLinkedListOrder() {
        head = null;
        tail = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addLast(Order item) {
        if (isEmpty()) {
            head = tail = new NodeOrder(null, item, null);
        } else {
            NodeOrder newNode = new NodeOrder(tail, item, null);
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    void sortName() {
        if (isEmpty()) {
            System.out.println("List is empty.");
            return;
        }
        for (NodeOrder i = head; i != null; i = i.next) {
            for (NodeOrder j = head; j != null && j.next != null; j = j.next) {
                if (j.data.orderName.compareToIgnoreCase(j.next.data.orderName) > 0) {
                    Order temp = j.data;
                    j.data = j.next.data;
                    j.next.data = temp;
                }
            }
        }
    }

    void printOrders() {
        if (isEmpty()) {
            System.out.println("Order list is empty.");
            return;
        }
        sortName();
        System.out.println("==================================================");
        System.out.println("ORDER REPORT (SORTED BY ORDER NUMBER)");
        System.out.println("==================================================");
        System.out.printf("%-15s %-20s %-15s\n", "Order Code", "Order Name", "Price");
        NodeOrder current = head;
        totalPrice = 0;
        while (current != null) {
            // totalPrice += current.data.price;
            // current = current.next;
            System.out.printf("%-15d %-20s %-15d\n", current.data.orderCode, current.data.orderName,
                    current.data.price);
            current = current.next;
        }
        // System.out.println("Total Price: " + totalPrice);

    }
}
