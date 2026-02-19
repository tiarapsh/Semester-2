package Jobsheet2;

public class StudentMain{
    public static void main(String[] args) {
        Student22 student1 = new Student22();
        student1.Name = "Tiara";
        student1.NIM = "254107060138";
        student1.Class = "G";
        student1.IPK = 3.75;

        student1.showInformation();
        System.out.println("Performance: " + student1.Score());
    }
}
