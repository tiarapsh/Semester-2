package Jobsheet2.Class;

public class CourseMain22 {
    public static void main(String[] args) {
        Course22 course1 =  new Course22();
        course1.codeCourse = "SIB01";
        course1.name = "Algoritm and Programming";
        course1.sks = 3;
        course1.numberOfHours = 45;
        course1.displayInformation();
        course1.changeSKS(4);
        course1.addHours(15);
        course1.displayInformation();
        course1.reduceHours(80);
    }
}
