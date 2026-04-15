package CaseMethod_TiaraPashaRamadhani_SIB1G;

public class StudentData {
    Student [] listStudent;
    int idx;

    public void add(Student student){
        if(idx < listStudent.length){
            listStudent[idx] = student;
            idx++;
        } else {
            System.out.println("Data is already full!");
        }
    }
    public void print(){
        for (int i = 0; i < idx; i++) {
            listStudent[i].print();
        }
    }
}
