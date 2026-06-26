package Week14;

public class BinaryTree22 {
    Node22 root;

    BinaryTree22() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(Student22 data) {
        if (isEmpty()) {
            root = new Node22(data);
        } else {
            Node22 current = root;
            while (true) {
                if (data.ipk < current.data.ipk) {
                    if (current.left != null) {
                        current = current.left;
                    } else {
                        current.left = new Node22(data);
                        break;
                    }
                } else if (data.ipk > current.data.ipk) {
                    if (current.right != null) {
                        current = current.right;
                    } else {
                        current.right = new Node22(data);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }

    public boolean find(double ipk) {
        boolean result = false;
        Node22 current = root;
        while (current != null) {
            if (current.data.ipk == ipk) {
                result = true;
                break;
            } else if (ipk < current.data.ipk) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return result;
    }

    public void traversePreOrder(Node22 node) {
        if (node != null) {
            node.data.print();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traverseInOrder(Node22 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.data.print();
            traverseInOrder(node.right);
        }
    }

    public void traversePostOrder(Node22 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.data.print();
        }
    }

    Node22 getSuccessor(Node22 del) {

        Node22 successor = del.right;
        Node22 successorParent = del;

        while (successor.left != null) {

            successorParent = successor;
            successor = successor.left;
        }

        if (successor != del.right) {

            successorParent.left = successor.right;
            successor.right = del.right;
        }

        return successor;
    }

    //delete
    public void delete(double ipk) {

        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }
        Node22 parent = root;
        Node22 current = root;
        boolean isLeftChild = false;
        while (current.data.ipk != ipk) {
            parent = current;
            if (ipk < current.data.ipk) {
                isLeftChild = true;
                current = current.left;
            } else {
                isLeftChild = false;
                current = current.right;
            }

            if (current == null) {
                System.out.println("Couldn't find data!");
                return;
            }
        }

        // Case 1: Node has no children
        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            } else if (isLeftChild) {
                parent.left = null;
            } else {
                parent.right = null;
            }
            // Case 2: Node has only left child
        } else if (current.right == null) {
            if (current == root) {
                root = current.left;
            } else if (isLeftChild) {
                parent.left = current.left;
            } else {
                parent.right = current.left;
            }

            // Case 3: Node has only right child
        } else if (current.left == null) {
            if (current == root) {
                root = current.right;
            } else if (isLeftChild) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }

            // Case 4: Node has two children
        } else {
            Node22 successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.left = successor;
            } else {
                parent.right = successor;
            }
            successor.left = current.left;
        }
    }

    public void addRekursif(Student22 data) {
        root = addRekursif(root, data);
    }

    public Node22 addRekursif(Node22 current, Student22 data) {
        if (current == null) {
            return new Node22(data);
        }
        if (data.ipk < current.data.ipk) {
            current.left = addRekursif(current.left, data);
        } else if (data.ipk > current.data.ipk) {
            current.right = addRekursif(current.right, data);
        }
        return current;
    }

    public Student22 getMinIPK() {
        if (isEmpty()) {
            return null;
        }
        Node22 current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }

    public Student22 getMaxIPK() {
        if (isEmpty()) {
            return null;
        }
        Node22 current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }

    public void displayStudentsWithIPKAbove(double threshold) {
        displayStudentsWithIPKAbove(root, threshold);
    }

    public void displayStudentsWithIPKAbove(Node22 node, double threshold) {

        if (node != null) {

            displayStudentsWithIPKAbove(node.left, threshold);

            if (node.data.ipk > threshold) {
                node.data.print();
            }

            displayStudentsWithIPKAbove(node.right, threshold);
        }
    }
}
