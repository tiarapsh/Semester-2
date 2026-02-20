package Jobsheet2.Lecturer;

public class LecturersMain22 {
    public static void main(String[] args) {
        Lecturers22 lecturer1 = new Lecturers22();
        lecturer1.idLecturer = "Lecturer01";
        lecturer1.name = "Dr. Budi";
        lecturer1.activeStatus = true;
        lecturer1.yearOfEntry = 2010;
        lecturer1.expertiseCompetency = "Algoritm and Programming";
        lecturer1.setActiveStatus(false);
        lecturer1.calculateTimeWork(2024);
        lecturer1.changeSkill("Data Science");
        lecturer1.displayInformation();

        Lecturers22 lecturer2 = new Lecturers22();
        lecturer2.idLecturer = "Lecturer02";
        lecturer2.name = "Dr. Aminah";
        lecturer2.activeStatus = true;
        lecturer2.yearOfEntry = 2015;
        lecturer2.expertiseCompetency = "Software Engineering";
        lecturer2.calculateTimeWork(2027);
        lecturer2.displayInformation();
    }
}
