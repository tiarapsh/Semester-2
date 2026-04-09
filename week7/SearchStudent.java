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

    public int FindBinarySearch(int cari, int left, int right){
        int mid;
        if(right >= left){
            mid = (left + right) / 2;
            if(cari == listStd[mid].nim){
                return mid;
            } else if(listStd[mid].nim > cari){
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    public void sort(){
    for(int i = 0; i < listStd.length - 1; i++){
        for(int j = 0; j < listStd.length - i - 1; j++){
            if(listStd[j].nim > listStd[j+1].nim){
                Student temp = listStd[j];
                listStd[j] = listStd[j+1];
                listStd[j+1] = temp;
            }
        }
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
