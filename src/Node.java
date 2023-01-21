public class Node {
    private double self;
    private Node previousNode;
    private Node left;
    private Node right;

    Node(double self, Node prev, Node left, Node right) {
        this.self = self;
        this.previousNode = prev;
        this.left = left;
        this.right = right;
    }

    public Node insertFromNode(Node a) {
        a.previousNode = this;
        if (a.self < self)
            if (this.left == null)
                return this.left = a;
            else
                return this.left.insertFromNode(a);

        if (this.right == null)
            return this.right = a;
        else
            return this.right.insertFromNode(a);
    }

    public static Node simpleConstructor(double self, Node prev) {
        return new Node(self, prev, null, null);
    }

    public static Node simpleConstructor(double self) {
        return new Node(self, null, null, null);
    }

    public double getSelf() {
        return self;
    }

    public void setSelf(double self) {
        this.self = self;
    }

    public Node getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(Node head) {
        this.previousNode = head;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node placeLeft(Node l) {
        setLeft(l);
        return this.left;
    }

    public Node placeRight(Node r) {
        setRight(r);
        return this.right;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Self value: " + self;
    }
}