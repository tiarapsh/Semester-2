package Praktikum03;

public class MataKuliah22 {
    public String code;
    public String name;
    public int sks;
    public int jumlahJam;

    public MataKuliah22(String code, String name, int sks, int jumlahJam) {
        this.code = code;
        this.name = name;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void addData(String kode, String nama, int sks, int jumlahJam) {
        this.code = kode;
        this.name = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void printInfo() {
        System.out.println("Kode       : " + code);
        System.out.println("Nama       : " + name);
        System.out.println("SKS        : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
        System.out.println("------------------------------");
    }
}