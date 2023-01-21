public class App {
    public static void main(String[] args) throws Exception {
        BinaryTree a = new BinaryTree();
        var node = Node.simpleConstructor(1d);
        var node1 = Node.simpleConstructor(2d);
        var node2 = Node.simpleConstructor(1.8);
        var node3 = Node.simpleConstructor(1.95);

        a.addNode(node);
        a.addNode(node1);
        a.addNode(node2);
        a.addNode(node3);
        // a.pushNode(node3);
        System.out.println(a.root.getRight().getLeft().getRight());
        System.out.println(a.root.getRight().getLeft().getRight().getPreviousNode());
    }
}
