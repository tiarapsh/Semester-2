package week7;

public class SearchStudent {
    Student[] listStd = new Student[5];
    int idx;

    public void add(Student std) {
        if (idx < listStd.length) {
            listStd[idx] = std;
            idx++;
        } else {
            System.out.println("Data is already full!");
        }
    }
    public void display(){
        for (Student student : listStd) {
            student.print();
            System.out.println("----------------------");
        }
    }
    public int findSeqSearch(int search){
        int position = -1;
        for (int i = 0; i < listStd.length; i++) {
            if(listStd[i].nim == search){
                position = i;
                break;
            }
        }
        return position;
    }
    public void showPosition(int x, int pos){
        if(pos != -1){
            System.out.println("Data " + x + " is found at index " + pos);
        } else {
            System.out.println("Data " + x + " is not found");
        }
    }
    public void showData(int x, int pos){
        if(pos != -1){
            System.out.println("NIM: " + listStd[pos].nim);
            System.out.println("Name: " + listStd[pos].name);
            System.out.println("Age: " + listStd[pos].age);
            System.out.println("GPA: " + listStd[pos].gpa);
        } else {
            System.out.println("Data " + x + " is not found");
        }
    }
}
