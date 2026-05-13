public class Student00 {
    String nim, name, className;
    double gpa;

    public Student00() {
    }

    public Student00(String nm, String nama, String kls, double ip) {
        nim = nm;
        name = nama;
        className = kls;
        gpa = ip;
    }

    void print() {
        System.out.println(nim + " - " + name + " - " + className + " - " + gpa);
    }
}