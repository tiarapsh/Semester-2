package PraktikumUAS_TiaraPashaRamadhani_SIB1G;

public class DLLVehicle {
    Node.NodeDLLVehicle head;
    Node.NodeDLLVehicle tail;

    //menambah data kendaraan di akhir 
    public void addLast(Vehicle data) {

        Node.NodeDLLVehicle newNode = new Node.NodeDLLVehicle(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

// untuk mencari kendaraan dari tnkb
    public Vehicle findVehicle(String tnkb) {

        Node.NodeDLLVehicle current = head;

        while (current != null) {

            if (current.data.tnkb.equalsIgnoreCase(tnkb)) {
                return current.data;
            }

            current = current.next;
        }

        return null;
    }

    // menampilkan kendaraan 
    public void displayVehicle() {

        Node.NodeDLLVehicle current = head;

        System.out.println("=================================================================");
        System.out.printf("%-10s %-15s %-5s %-6s %-6s %-10s%n",
                "TNKB", "Name", "Type", "CC", "Year", "MustPay");
        System.out.println("=================================================================");

        while (current != null) {

            Vehicle v = current.data;

            System.out.printf("%-10s %-15s %-5d %-6d %-6d %-10d%n",
                    v.tnkb,
                    v.name,
                    v.type,
                    v.cc,
                    v.year,
                    v.monthMustPay);

            current = current.next;
        }
    }
}
