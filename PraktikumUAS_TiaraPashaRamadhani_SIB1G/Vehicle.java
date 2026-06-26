package PraktikumUAS_TiaraPashaRamadhani_SIB1G;

public class Vehicle {
    //inisialisasi variabel
    String tnkb;
    String name;
    int type;
    int cc;
    int year;
    int monthMustPay;

    // ini adalah constructor buat Vehicle
    public Vehicle(String tnkb, String name, int type, int cc, int year, int monthMustPay) {
        this.tnkb = tnkb;
        this.name = name;
        this.type = type;
        this.cc = cc;
        this.year = year;
        this.monthMustPay = monthMustPay;
    }
}
