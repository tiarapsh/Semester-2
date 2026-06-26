package PraktikumUAS_TiaraPashaRamadhani_SIB1G;

public class Node {
    //ini untuk nyimpen data dari vehicle di dll
     public static class NodeDLLVehicle {
        Vehicle data;
        NodeDLLVehicle prev;
        NodeDLLVehicle next;

        public NodeDLLVehicle(Vehicle data) {
            this.data = data;
        }
    }

    //ini untuk nyimpen data dari tax di dll
    public static class NodeDLLTax {
        Tax data;
        NodeDLLTax prev;
        NodeDLLTax next;

        public NodeDLLTax(Tax data) {
            this.data = data;
        }
    }

    //ini untuk nyimpen data dari tax di bst
    public static class NodeBSTTax {
        Tax data;
        NodeBSTTax left;
        NodeBSTTax right;

        public NodeBSTTax(Tax data) {
            this.data = data;
        }
    }
}