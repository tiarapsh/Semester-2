package Jobsheet10;

public class studentAssignmentStack {
    student22[] stack;
    int top, size;

    int count() {
        return top + 1;
    }

    studentAssignmentStack(int size) {
        this.size = size;
        top = -1;
        stack = new student22[size];
    }

    boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    void push(student22 student) {
        if (!isFull()) {
            top++;
            stack[top] = student;
        } else {
            System.out.println("Stack is already full!");
        }
    }

    student22 pop() {
        if (!isEmpty()) {
            student22 temp = stack[top];
            top--;
            return temp;
        } else {
            System.out.println("Stack is already empty!");
            return null;
        }
    }

    student22 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack is already empty!");
            return null;
        }
    }

    student22 getFirst() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            return null;
        }
    }

    String convertToBinary(int grade){
        conversionStack22 stack = new conversionStack22();
        while (grade > 0) {
            int mod = grade % 2;
            stack.push(mod);
            grade /= 2;
        }
        String binary = "";
        while (!stack.isEmpty()) {
            binary += stack.pop();
        }
        return binary;
    }

    void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nim + "\t" + stack[i].name + "\t" + stack[i].className);
        }
        System.out.println("");
    }
}
