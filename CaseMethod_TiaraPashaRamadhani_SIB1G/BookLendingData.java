package CaseMethod_TiaraPashaRamadhani_SIB1G;

public class BookLendingData {
    BookLending[] listBookLending;
    BookLending[] loanPeriod;
    int idx;

    public void add(BookLending bookLending) {
        if (idx < listBookLending.length) {
            listBookLending[idx] = bookLending;
            idx++;
        } else {
            System.out.println("Data is already full!");
        }
    }

    public void sortFine() {
        for (int i = 1; i < idx; i++) {
            BookLending temp = listBookLending[i];
            int j = i;

            while (j > 0 && listBookLending[j - 1].fine < temp.fine) {
                listBookLending[j] = listBookLending[j - 1];
                j--;
            }

            listBookLending[j] = temp;
        }
    }

    public void count() {
        int count = 0;
        for (int k = 0; k < idx; k++) {
            if (listBookLending[k].loanPeriod > 5) {
                count++;
            }
        }
        System.out.println("Number of students whose loan period exceeds 5 days: " + count);
    }

    public void sortStudent() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (listBookLending[j].sdt.nim.compareTo(listBookLending[j + 1].sdt.nim) > 0) {
                    BookLending temp = listBookLending[j];
                    listBookLending[j] = listBookLending[j + 1];
                    listBookLending[j + 1] = temp;
                }
            }
        }
    }

    public int FindBinarySearch(String search, int left, int right) {
        int mid;

        if (right >= left) {
            mid = (left + right) / 2;

            if (listBookLending[mid].sdt.nim.equals(search)) {
                return mid;
            } else if (listBookLending[mid].sdt.nim.compareTo(search) > 0) {
                return FindBinarySearch(search, left, mid - 1);
            } else {
                return FindBinarySearch(search, mid + 1, right);
            }
        }
        return -1;
    }

    public void showData(String nim, int pos) {
        if (pos != -1) {
            int i = pos;
            while (i >= 0 && listBookLending[i].sdt.nim.equals(nim)) {
                listBookLending[i].printLending();
                i--;
            }
            i = pos + 1;
            while (i < idx && listBookLending[i].sdt.nim.equals(nim)) {
                listBookLending[i].printLending();
                i++;
            }

        } else {
            System.out.println("Data " + nim + " not found");
        }
    }

    public void print() {
        for (int i = 0; i < idx; i++) {
            listBookLending[i].printLending();
        }
    }
}
