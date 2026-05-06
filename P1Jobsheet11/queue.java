package P1Jobsheet11;

public class queue {
    int[] data;
    int front, rear, size, max;

    public queue(int n) {
        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == max;
    }

    void peek() {
        if (!isEmpty()) {
            System.out.println("Front data: " + data[front]);
        } else {
            System.out.println("Queue is empty!!!");
        }
    }

    void print() {
        if (!isEmpty()) {
            int i = front;
            while (i != rear) {
                System.out.print(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i]);
            System.out.println("Number of element: " + size);
        } else {
            System.out.println("Queue is empty!!!");
        }
    }

    void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("All data removed!");
        } else {
            System.out.println("Queue already empty!");
        }
    }

    void enqueue(int dt) {
        if (isFull()) {
            System.out.println("Queue overflow!");
            System.exit(0);
        }

        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % max;
        }

        data[rear] = dt;
        size++;
        System.out.println(dt + " added at index " + rear);
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue underflow!");
            System.exit(0);
        }

        int dt = data[front];
        size--;

        if (isEmpty()) {
            front = rear = -1;
        } else {
            front = (front + 1) % max;
        }

        return dt;
    }
}
