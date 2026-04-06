package sorting;

public class LecturerData22 {
    Lecturer22 lecturerData[] = new Lecturer22[10];
    int idx;

    void add(Lecturer22 dsn) {
        if (idx < lecturerData.length) {
            lecturerData[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data is full!");
        }
    }

    void print() {
        if (idx == 0) {
            System.out.println("No data!");
        } else {
            for (int i = 0; i < idx; i++) {
                lecturerData[i].print();
            }
        }
    }

    // ASC
    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (lecturerData[j].age > lecturerData[j + 1].age) {
                    Lecturer22 temp = lecturerData[j];
                    lecturerData[j] = lecturerData[j + 1];
                    lecturerData[j + 1] = temp;
                }
            }
        }
    }

    // DSC
    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int max = i;
            for (int j = i + 1; j < idx; j++) {
                if (lecturerData[j].age > lecturerData[max].age) {
                    max = j;
                }
            }
            Lecturer22 temp = lecturerData[max];
            lecturerData[max] = lecturerData[i];
            lecturerData[i] = temp;
        }
    }
}
