public class Node /* Sem generico */ {
    private Double self;
    private Node head;
    private Node left;
    private Node right;

    Node(Double self, Node prev, Node left, Node right) {
        this.self = self;
        this.head = prev;
        this.left = left;
        this.right = right;
    }

    public Node Esqdir(Node a){
        if (a.self < self ){
            if(this.getLeft() == null){
                this.setLeft(a);
                return a;
            }
            else{
                return this.getLeft().Esqdir(a);
            }}
            else{
                if(this.getRight() == null){
                    this.setRight(a);
                    return a;
                }
                else{
                    return this.getLeft().Esqdir(a);
                }
        }
        
    }    

    public static Node SimpleNode(Double self, Node prev){
        return new Node(self, prev, null, null);
    }

    public Double getSelf() {
        return self;
    }
    public void setSelf(Double self) {
        this.self = self;
    }
    public Node getHead() {
        return head;
    }
    public void setHead(Node head) {
        this.head = head;
    }
    public Node getLeft() {
        return left;
    }
    public void setLeft(Node left) {
        this.left = left;
    }
    public Node getRight() {
        return right;
    }
    public void setRight(Node right) {
        this.right = right;
    }
}