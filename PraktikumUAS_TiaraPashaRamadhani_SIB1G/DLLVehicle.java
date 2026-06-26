package PraktikumUAS_TiaraPashaRamadhani_SIB1G;

public class DLLVehicle {
    NodeVehicle head, tail;

    public void addLast(Vehicle vehicle){
        NodeVehicle newNode = new NodeVehicle(vehicle);
        if (head == null){
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public Vehicle findTNKB(String tnkb){
        NodeVehicle current = head;
        while (current != null){
            if ( current.data.tnkb.equalsIgnoreCase(tnkb)){
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    public void display(){
        System.out.println("=== Register Vehicle === ");
        System.out.println("TNKB\tName\tType\tCC\tYear\tMonth Must Pay");
        NodeVehicle current = head;
        while (current !=null){
            Vehicle vehicle = current.data;
            System.out.println(vehicle.tnkb + "\t" + vehicle.name + "\t" + vehicle.type + "\t" + vehicle.cc + "\t" + vehicle.year + "\t" + vehicle.monthMustPay);
            current = current.next;
        }
    }
}
