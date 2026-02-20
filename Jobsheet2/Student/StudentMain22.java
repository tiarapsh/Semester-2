package Jobsheet2.Student;

public class StudentMain22 {
    public static void main(String[] args) {
        Student22 mhs1 = new Student22();
        mhs1.Name = "Tiara";
        mhs1.NIM = "254107060138";
        mhs1.Class = "G";
        mhs1.IPK = 3.75;

        mhs1.showInformation();
        mhs1.changeClass("F");
        mhs1.updateIPK(3.85);
        mhs1.showInformation();
        
        Student22 mhs2 = new Student22("Annisa Nabila","254107060199", 3.25, "TI 2L");
        mhs2.updateIPK(3.30);
        mhs2.showInformation();
    }
}
