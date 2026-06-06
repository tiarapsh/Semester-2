package Week14;

public class BinaryTreeArray22 {
    Student22[] data;
    int idxLast;

    public BinaryTreeArray22() {
        data = new Student22[10];
        idxLast = -1;
    }

    void populateData(Student22[] data, int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (data[idxStart] != null) {

                traverseInOrder(2 * idxStart + 1);

                data[idxStart].print();

                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    public void add(Student22 dataBaru) {

        if (idxLast == data.length - 1) {
            System.out.println("Array is full!");
            return;
        }

        data[++idxLast] = dataBaru;
    }

    public void traversePreOrder(int idxStart) {

        if (idxStart <= idxLast && data[idxStart] != null) {

            data[idxStart].print();

            traversePreOrder(2 * idxStart + 1);

            traversePreOrder(2 * idxStart + 2);
        }
    }
}
