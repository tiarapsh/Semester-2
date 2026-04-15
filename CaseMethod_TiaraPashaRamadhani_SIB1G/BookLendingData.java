package CaseMethod_TiaraPashaRamadhani_SIB1G;

public class BookLendingData {
    BookLending[] listBookLending;
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
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (listBookLending[j].fine < listBookLending[j + 1].fine) {
                    BookLending temp = listBookLending[j];
                    listBookLending[j] = listBookLending[j + 1];
                    listBookLending[j + 1] = temp;
                }
            }
        }
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
