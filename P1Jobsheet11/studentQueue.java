package P1Jobsheet11;

public class studentQueue {
    student[] data;
    int front, rear, size, max;

    public studentQueue(int n){
        max = n;
        data = new student[max];
        size = 0;
        front = 0;
        rear = -1;
    }

    boolean isEmpty(){
        return size == 0;
    }

    boolean isFull(){
        return size == max;
    }

    void enqueue(student dt){
        if(isFull()){
            System.out.println("Queue is full!!!");
            return;
        }

        rear = (rear + 1) % max;
        data[rear] = dt;
        size++;
        System.out.println(dt.name + " added at index " + rear);
    }

    student dequeue(){
        if(isEmpty()){
            System.out.println("Queue empty!!!");
            return null;
        }

        student dt = data[front];
        front = (front + 1) % max;
        size--;
        System.out.println("Student being served:\n" + dt.nim + " - " + dt.name + " - " + dt.studyProgram + " - " + dt.className);
        return dt;
        
    }

    void peek(){
        if(!isEmpty()){
            data[front].print();
        }
    }

    void print(){
        if(isEmpty()){
            System.out.println("Empty");
            return;
        }

        int i = front;
        while(i != rear){
            data[i].print();
            i = (i + 1) % max;
        }
        data[i].print();
    }

    void viewRear(){
        if(!isEmpty()){
            System.out.print("Rear: ");
            data[rear].print();
        }
    }
}
