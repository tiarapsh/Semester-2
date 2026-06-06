package Week14;

public class BinaryTreeArrayMain22 {
    public static void main(String[] args) {

       BinaryTreeArray22 bta = new BinaryTreeArray22();

        bta.add(new Student22("244107020138", "Devin", "TI-1I", 3.57));
        bta.add(new Student22("244107020023", "Dewi", "TI-1I", 3.85));
        bta.add(new Student22("244107020225", "Wahyu", "TI-1I", 3.21));
        bta.add(new Student22("244107020076", "Angelina", "TI-1I", 3.54));
        bta.add(new Student22("244107020223", "Andhika", "TI-1I", 3.72));
        bta.add(new Student22("244107020226", "Bima", "TI-1I", 3.37));
        bta.add(new Student22("244107020181", "Eiyu", "TI-1I", 3.46));

        System.out.println("PreOrder Traversal:");
        bta.traversePreOrder(0);

        // BinaryTreeArray22 bta = new BinaryTreeArray22();

        // Student22 m1 = new Student22("244107020138", "Devin", "TI-1I", 3.57);
        // Student22 m2 = new Student22("244107020023", "Dewi", "TI-1I", 3.85);
        // Student22 m3 = new Student22("244107020225", "Wahyu", "TI-1I", 3.21);
        // Student22 m4 = new Student22("244107020076", "Angelina", "TI-1I", 3.54);

        // Student22[] dataMahasiswa = {
        // m1, m2, m3, m4
        // };

        // bta.populateData(dataMahasiswa, 3);

        // System.out.println("\nInOrder Traversal:");
        // bta.traverseInOrder(0);

    }
}
