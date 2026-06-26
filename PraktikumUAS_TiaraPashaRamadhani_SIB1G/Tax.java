package PraktikumUAS_TiaraPashaRamadhani_SIB1G;

public class Tax {
    static int counter = 1;
    int code;
    int nominal;
    int fine;
    int monthPay;
    Vehicle vehicle;

    Tax prev;
    Tax next;

    public Tax(Vehicle vehicle, int monthPay) {
        this.code = counter++;
        this.vehicle = vehicle;
        this.monthPay = monthPay;
        calculateTax();
    }

    public void calculateTax() {
        if (vehicle.type == 2) {
            if (vehicle.cc < 100)
                nominal = 100000;
            else if (vehicle.cc <= 250)
                nominal = 250000;
            else
                nominal = 500000;
        } else if (vehicle.type == 4) {
            if (vehicle.cc < 1000)
                nominal = 750000;
            else if (vehicle.cc <= 2500)
                nominal = 1000000;
            else
                nominal = 1500000;
        }
    }

    public void calculateFine() {
        int lateMonth = monthPay - vehicle.monthMustPay;
        if (lateMonth > 0){
            if (lateMonth <= 3){
                fine = 50000;
            }else {
                fine = lateMonth * 50000;
            }
        } else {
            fine = 0;
        }
    }
}