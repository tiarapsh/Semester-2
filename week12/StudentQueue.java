public class StudentQueue {

    Node front;
    Node rear;
    int size;
    int max;

    public StudentQueue(int max) {
        this.max = max;
        size = 0;
        front = rear = null;
    }

    boolean isEmpty() {
        return front == null;
    }

    boolean isFull() {
        return size == max;
    }

    void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Queue cleared!");
    }

    void enqueue(Student data) {

        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }

        Node newNode = new Node(data, null);

        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        size++;

        System.out.println(data.name + " added to queue.");
    }

    Student dequeue() {

        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return null;
        }

        Student data = front.data;

        if (front == rear) {
            front = rear = null;
        } else {
            front = front.next;
        }

        size--;

        return data;
    }

    void peekFront() {

        if (!isEmpty()) {
            System.out.println("Front Queue:");
            front.data.print();
        } else {
            System.out.println("Queue is empty!");
        }
    }

    void peekRear() {

        if (!isEmpty()) {
            System.out.println("Rear Queue:");
            rear.data.print();
        } else {
            System.out.println("Queue is empty!");
        }
    }

    void totalQueue() {
        System.out.println("Total queue: " + size);
    }

    void print() {

        if (isEmpty()) {
            System.out.println("Queue is empty!");
        } else {

            Node temp = front;

            System.out.println("Queue List:");

            while (temp != null) {
                temp.data.print();
                temp = temp.next;
            }
        }
    }
}