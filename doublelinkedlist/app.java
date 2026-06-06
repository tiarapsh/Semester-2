package doublelinkedlist;

public class app {
    nodeApp head;
    nodeApp tail;

    public void addLast(String data) {
        nodeApp newNode = new nodeApp(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void printBackward() {
        nodeApp current = tail;

        while (current != null) {
            System.out.print(current.data);

            if (current.prev != null) {
                System.out.print(" -> ");
            }

            current = current.prev;
        }

        System.out.println();
    }
}
