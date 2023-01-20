public class BinaryTree {  
    public Node root;
    public Node last;

    BinaryTree(Node root) {
        this.root = root;
        this.last = root;
    }


    public Node Addnode(Node a){
        return this.last = this.last.Esqdir(a);
    }

    public Node left() {
        return this.root.getLeft();
    }
    public Node right() {
        return this.root.getRight();
    }

}