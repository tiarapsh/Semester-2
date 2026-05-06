package P1Jobsheet11;

public class Students {
     String nim, name, studyProgram, className;

    public Students(String nim, String name, String studyProgram, String className){
        this.nim = nim;
        this.name = name;
        this.studyProgram = studyProgram;
        this.className = className;
    }

    void print(){
        System.out.println(nim + " - " + name + " - " + studyProgram + " - " + className);
    }
}
