package PraktikumUAS_TiaraPashaRamadhani_SIB1G;

public class DLLTax {
    Node.NodeDLLTax head;
    Node.NodeDLLTax tail;

    //menambah data kendaraan di akhir 
    public void addLast(Tax data) {

        Node.NodeDLLTax newNode = new Node.NodeDLLTax(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    //untuk total income semuanya
    public int getTotalIncome() {

        int total = 0;

        Node.NodeDLLTax current = head;

        while (current != null) {
            total += current.data.getTotal();
            current = current.next;
        }

        return total;
    }

    //menampilkan
    public void displayTransaction() {

        if (head == null) {
            System.out.println("No transaction data.");
            return;
        }

        Node.NodeDLLTax current = head;

        System.out.println("================================================================================");
        System.out.printf("%-5s %-10s %-15s %-10s %-10s %-10s%n",
                "Code", "TNKB", "Name", "Tax", "Fine", "Total");
        System.out.println("================================================================================");

        while (current != null) {

            Tax t = current.data;

            System.out.printf("%-5d %-10s %-15s %-10d %-10d %-10d%n",
                    t.code,
                    t.vehicle.tnkb,
                    t.vehicle.name,
                    t.nominal,
                    t.fine,
                    t.getTotal());

            current = current.next;
        }
    }

    public Tax payTax(DLLVehicle vehicleList,
            String tnkb,
            int monthPay) {

        Vehicle vehicle = vehicleList.findVehicle(tnkb);

        if (vehicle == null) {
            return null;
        }

        Tax tax = new Tax(vehicle, monthPay);

        addLast(tax);

        return tax;
    }

    public void sortTransaction() {

    if (head == null) {
        System.out.println("No transaction data.");
        return;
    }

    BSTTax bst = new BSTTax();

    Node.NodeDLLTax current = head;

    while (current != null) {
        bst.add(current.data);
        current = current.next;
    }

    System.out.println("=================================================");
    System.out.printf("%-5s %-10s %-15s %-10s%n",
            "Code", "TNKB", "Name", "Total");
    System.out.println("=================================================");

    bst.inorder(bst.root);
}
}
