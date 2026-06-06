package CaseMethod2_TiaraPashaRamadhani_SIB1G;

public class NodeOrder {
    Order data;
    NodeOrder prev;
    NodeOrder next;

    NodeOrder() {

    }

    NodeOrder(Order data) {
        this.data = data;
        prev = null;
        next = null;
    }

    NodeOrder(NodeOrder prev, Order data, NodeOrder next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}
