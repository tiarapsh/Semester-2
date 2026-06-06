package queueExercise;

public class Latihan4 {
    int[] data;
    int front, rear, size, max;

    public Latihan4(int n) {
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

    void enqueue(int data) {

        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % max;
        }

        this.data[rear] = data;
        size++;
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        int removedData = data[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % max;
        }
        size--;
        System.out.println("Removed: " + removedData);
    }

    void print() {
        if (!isEmpty()) {
            int i = front;
            while (i != rear) {
                System.out.print(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i]);
            System.out.println("Front: " + data[front] + "\nRear: " + data[rear]);
        } else {
            System.out.println("Queue is empty!!!");
        }
    }
}
