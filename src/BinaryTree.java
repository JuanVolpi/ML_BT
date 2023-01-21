public class BinaryTree {
    public Node root;
    public Node last;

    BinaryTree(Node root) {
        this.root = root;
        this.last = root;
    }

    BinaryTree() {
        new BinaryTree(null);
    }

    /* O(1) insertion */
    public Node addNode(Node a) {
        if (root == null)
            return this.root = this.last = a;
        else
            return this.last = this.last.insertFromNode(a);
    }

    public Node getRoot() {
        return root;
    }

    public Node getLast() {
        return last;
    }
}