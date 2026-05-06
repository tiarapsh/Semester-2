package P1Jobsheet11;

public class KRSQueue {
   Students[] data;
    int front, rear, size, max;
    int servedCount;
    final int MAX_SERVE = 30;

    public KRSQueue(int n){
        max = n; 
        data = new Students[max];
        front = 0;
        rear = -1;
        size = 0;
        servedCount = 0;
    }

    boolean isEmpty(){
        return size == 0;
    }

    boolean isFull(){
        return size == max;
    }

    void enqueue(Students s){
        if(isFull()){
            System.out.println("Queue is full!");
            return;
        }

        if(servedCount >= MAX_SERVE){
            System.out.println("Service limit (30 students) has been reached!");
            return;
        }

        rear = (rear + 1) % max;
        data[rear] = s;
        size++;

        System.out.println(s.name + " added to the queue.");
    }

    void dequeue2(){
        if(size < 2){
            System.out.println("At least 2 students are required to process.");
            return;
        }

        if(servedCount >= MAX_SERVE){
            System.out.println("Service limit reached!");
            return;
        }

        System.out.println("Processing students:");

        for(int i = 0; i < 2; i++){
            Students s = data[front];
            s.print();

            front = (front + 1) % max;
            size--;
            servedCount++;
        }
    }

    void printAll(){
        if(isEmpty()){
            System.out.println("Queue is empty!");
            return;
        }

        int i = front;
        while(i != rear){
            data[i].print();
            i = (i + 1) % max;
        }
        data[i].print();
    }

    void peek2(){
        if(size < 2){
            System.out.println("Less than 2 students in queue.");
            return;
        }

        System.out.println("First two students in queue:");
        data[front].print();
        data[(front + 1) % max].print();
    }

    void viewRear(){
        if(isEmpty()){
            System.out.println("Queue is empty!");
            return;
        }

        System.out.println("Last student in queue:");
        data[rear].print();
    }

    void clear(){
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Queue has been cleared.");
    }

    void info(){
        System.out.println("Total students in queue: " + size);
        System.out.println("Students already processed: " + servedCount);
        System.out.println("Students not yet processed: " + size);
    }
}
