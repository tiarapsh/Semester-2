package PraktikumUAS_TiaraPashaRamadhani_SIB1G;

public class BSTTax {
    Node.NodeBSTTax root;

    //nyisipin data ke bst
    public Node.NodeBSTTax insert(Node.NodeBSTTax root,
            Tax data) {

        if (root == null) {
            return new Node.NodeBSTTax(data);
        }

        if (data.vehicle.name.compareToIgnoreCase(
                root.data.vehicle.name) < 0) {

            root.left = insert(root.left, data);

        } else {

            root.right = insert(root.right, data);

        }

        return root;
    }

    //untuk menambahkan data bst    
    public void add(Tax data) {
        root = insert(root, data);
    }

    //traversal inorder
    public void inorder(Node.NodeBSTTax root) {

        if (root != null) {

            inorder(root.left);

            Tax t = root.data;

            System.out.printf("%-5d %-10s %-15s %-10d%n",
                    t.code,
                    t.vehicle.tnkb,
                    t.vehicle.name,
                    t.nominal + t.fine);

            inorder(root.right);
        }
    }
}
