package Jobsheet10;

public class ExcuseLetterStack {
     ExcuseLetter22[] stack;
    int top, size;

    public ExcuseLetterStack(int size) {
        this.size = size;
        top = -1;
        stack = new ExcuseLetter22[size];
    }

    boolean isFull() {
        return top == size - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(ExcuseLetter22 data) {
        if (!isFull()) {
            stack[++top] = data;
            System.out.println("Excuse letter submitted successfully!");
        } else {
            System.out.println("Stack is full!");
        }
    }

    ExcuseLetter22 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("No data!");
            return null;
        }
    }

    ExcuseLetter22 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            return null;
        }
    }

    void searchByName(String name) {
        boolean found = false;

        for (int i = 0; i <= top; i++) {
            if (stack[i].name.equalsIgnoreCase(name)) {
                System.out.println("Letter found:");
                printDetail(stack[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Letter not found!");
        }
    }

    void printDetail(ExcuseLetter22 e) {
        System.out.println("ID: " + e.id);
        System.out.println("Name: " + e.name);
        System.out.println("Class: " + e.className);
        System.out.println("Type: " + e.typeOfExcuse);
        System.out.println("Duration: " + e.duration + " days");
        System.out.println("----------------------");
    }
}
