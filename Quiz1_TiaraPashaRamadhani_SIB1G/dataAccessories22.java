package Quiz1_TiaraPashaRamadhani_SIB1G;

public class dataAccessories22 {
    public static void display(Accessories22[] arrayOfAccessories22){
        int no = 1;
        for (Accessories22 accesories : arrayOfAccessories22) {
            System.out.println("Accessory no-" + no++);
            System.out.println("Name      : " + accesories.name);
            System.out.println("Category  : " + accesories.category);
            System.out.println("Price     : " + accesories.price);
            System.out.println("Sold      : " + accesories.sold);
            System.out.println("Stock     : " + accesories.stock);
            System.out.println("------------------------------");
        }
    }
    public static int calculateTotalSales(Accessories22[] arrayOfAccessories22){
        int totalSales = 0;
        for (Accessories22 accesories : arrayOfAccessories22) {
            totalSales += accesories.price * accesories.sold;
        }
        return totalSales;
    }

    public static void checkStock(Accessories22[] arrayOfAccessories22){
        for (Accessories22 accesories : arrayOfAccessories22) {
            if (accesories.stock < 5) {
                System.out.println(accesories.name + " is limited stock");
            }else {
                System.out.println(accesories.name + " has many stock");
            }
        }
    }

    public static void searchCheapestAccessoriss(Accessories22[] arrayOfAccessories22){
        int min = arrayOfAccessories22[0].price;
        Accessories22 cheapestAccessoriss = arrayOfAccessories22[0];
        for (Accessories22 accesories : arrayOfAccessories22) {
            if (accesories.price < min) {
                min = accesories.price;
                cheapestAccessoriss = accesories;
            }
        }
        System.out.println("The cheapest accessoriss is "+ cheapestAccessoriss.category + " with a price of " + min);
    }


}
