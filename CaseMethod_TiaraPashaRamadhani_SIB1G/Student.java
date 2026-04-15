package CaseMethod_TiaraPashaRamadhani_SIB1G;

public class Student {
    String nim;
    String name;
    String study_program;

    public Student(String nim, String name, String study_program) {
        this.nim = nim;
        this.name = name;
        this.study_program = study_program;
    }

    public void print() {
        System.out.println(
            "NIM: " + nim + " | " +
            "Name: " + name + " | " +
            "Study Program: " + study_program
        );
    }
}
