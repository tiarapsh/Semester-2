package queueExercise;

public class Latihan4Main {
    public static void main(String[] args) {
        Latihan4 queue = new Latihan4(5);
        queue.enqueue(101);
        queue.enqueue(102);
        queue.enqueue(103);
        queue.dequeue();
        queue.print();

    }
}
