package week7;

public class Student {
    int nim, age;
    String name;
    double gpa;

    public Student(int nim, String name, int age, double gpa) {
        this.nim = nim;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    public void print() {
        System.out.println("NIM: " + nim);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("----------------------");
    }
}
