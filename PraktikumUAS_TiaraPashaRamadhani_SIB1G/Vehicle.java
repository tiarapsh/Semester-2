package PraktikumUAS_TiaraPashaRamadhani_SIB1G;

public class Vehicle {
    String tnkb;
    String name;
    int type;
    int cc;
    int year;
    int monthMustPay;

    public Vehicle(String tnkb, String name, int type, int cc, int year, int monthMustPay) {
        this.tnkb = tnkb;
        this.name = name;
        this.type = type;
        this.cc = cc;
        this.year = year;
        this.monthMustPay = monthMustPay;
    }
}
