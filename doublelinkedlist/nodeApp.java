package doublelinkedlist;

public class nodeApp {
    String data;
    nodeApp next;
    nodeApp prev;

    nodeApp(String data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
