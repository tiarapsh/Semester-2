package Jobsheet2.Class;

public class Course22 {
    String codeCourse;
    String name;
    int sks;
    int numberOfHours;

    void displayInformation(){
        System.out.println("Code Course : " + codeCourse);
        System.out.println("Name : " + name);
        System.out.println("SKS : " + sks);
        System.out.println("Number of Hours : " + numberOfHours);
    }

    void changeSKS(int newSKS){
        sks = newSKS;
    }

    void addHours(int hours){
        numberOfHours += hours;
    }

    void reduceHours(int hours){
        if(numberOfHours - hours < 0){
            System.out.println("Error: Cannot reduce hours below zero.");
            return;
        }
        numberOfHours -= hours;
        System.out.println("Remaining hours: " + numberOfHours);
    }
}
