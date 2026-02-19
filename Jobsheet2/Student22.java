package Jobsheet2;

public class Student22 {
    String Name;
    String NIM;
    String Class;
    double IPK;

    void showInformation() {
        System.out.println("Name : " + Name);
        System.out.println("NIM : " + NIM);
        System.out.println("Class : " + Class);
        System.out.println("IPK : " + IPK);
    }

    void changeClass(String newClass) {
        Class = newClass;
    }

    void updateIPK(double newIPK) {
        if (newIPK >= 0.0 && newIPK <= 4.0) {
            IPK = newIPK;
        } else {
            System.out.println("GPA is invalid. Must be between 0.0 and 4.0");
        }
    }

    String performanceValue() {
        if (IPK >= 3.5) {
            return "Excellent Performance";
        } else if (IPK >= 3.0) {
            return "Good Performance";
        } else if (IPK >= 2.0) {
            return "Average Performance";
        } else {
            return "Needs Improvement";
        }
    }
}
