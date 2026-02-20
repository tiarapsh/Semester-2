package Jobsheet2.Lecturer;

public class Lecturers22 {
    String idLecturer;
    String name;
    boolean activeStatus;
    int yearOfEntry;
    String expertiseCompetency;

    void displayInformation(){
        System.out.println("ID Lecturer : " + idLecturer);
        System.out.println("Name : " + name);
        System.out.println("Active Status : " + activeStatus);
        System.out.println("Year of Entry : " + yearOfEntry);
        System.out.println("Expertise Competency : " + expertiseCompetency);
    }

    void setActiveStatus(boolean status){
        activeStatus = status;
    }

    void calculateTimeWork(int YearNow){
        int timeWork = YearNow - yearOfEntry;
        System.out.println("Time Work : " + timeWork);
    }

    void changeSkill(String skill){
        expertiseCompetency = skill;
    }
}
