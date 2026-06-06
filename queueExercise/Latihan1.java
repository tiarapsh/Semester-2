package queueExercise;

public class Latihan1 {
    int[] data;
    int front, rear, size, max;

    public Latihan1(int n) {
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

    void print() {
        if (!isEmpty()) {
            int i = front;
            while (i != rear) {
                System.out.print(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i]);
        } else {
            System.out.println("Queue is empty!!!");
        }
    }
}
