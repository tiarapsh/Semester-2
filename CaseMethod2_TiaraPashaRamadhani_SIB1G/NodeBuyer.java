package CaseMethod2_TiaraPashaRamadhani_SIB1G;

public class NodeBuyer {
    Buyer data;
    NodeBuyer prev;
    NodeBuyer next;

    NodeBuyer() {

    }

    NodeBuyer(Buyer data) {
        this.data = data;
        prev = null;
        next = null;
    }

    NodeBuyer(NodeBuyer prev, Buyer data, NodeBuyer next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}
