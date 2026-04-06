package sorting;

public class Lecturer22 {
    String id;
    String name;
    boolean gender;
    int age;

    Lecturer22(String id, String name, boolean gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    void print() {
        String jk = gender ? "Male" : "Female";
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + jk);
        System.out.println("Age: " + age);
        System.out.println("----------------------");
    }
}
