package queueExercise;

public class Latihan3 {
    int[] data;
    int front, rear, size, max;

    public Latihan3(int n) {
        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
    }

    boolean isFull() {
        return size == max;
    }
    
    boolean isEmpty() {
        return size == 0;
    }

    
    void peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        } else {
            System.out.println("Front element: " + data[front]);
        }
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
}
