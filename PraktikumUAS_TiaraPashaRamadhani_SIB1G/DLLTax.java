package PraktikumUAS_TiaraPashaRamadhani_SIB1G;

public class DLLTax {
    NodeTax head, tail;

    public void addLast(Tax tax){
        NodeTax newNode = new NodeTax(tax);
        if (head == null){
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void dailyTransactions(){
        if (head == null){
            System.out.println("No transactions");
            return;
        }
        System.out.println("=== Tax Payment ====");
        System.out.println("Code\tTNKB\tName\tType\tCC\tYear\tMonth Must Pay\tMonth Pay\tNominal\tFine");
        int totalNominal = 0;
        NodeTax current = head;
        while (current != null){
            Tax tax = current.data;
            int totalPay = tax.nominal + tax.fine;
            totalNominal += totalPay;
            System.out.println(tax.code + "\t" + tax.vehicle.tnkb + "\t" + tax.vehicle.name + "\t" + tax.vehicle.type + "\t" + tax.vehicle.cc + "\t" + tax.vehicle.year + "\t" + tax.vehicle.monthMustPay + "\t" + tax.monthPay + "\t" + tax.nominal + "\t" + tax.fine);
            current = current.next;
        }
        System.out.println("================================================================================");
        System.out.println("Total Income: Rp. "+totalNominal);
    }

    // public void sortName(){
    //     if (head == null || head.next == null)
    //         return;

    //     boolean swap;
    //     do {
    //         swap = false; 
    //         NodeTax current = head;
    //         while (current.next != null){
    //             if (current.data.vehicle.name.compareToIgnoreCase(current.next.data.vehicle.name) > 0){
    //                 Tax temp = current.data;
    //                 current.data = current.next.data;
    //                 current.next.data = temp;
    //                 swap = true;
    //             }
    //             current = current.next;
    //         } 
    //     } while (swap);
    //     System.out.println("Transaction successfully sorted by name");
    // }
}
