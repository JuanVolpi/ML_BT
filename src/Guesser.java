public class Guesser {
    public BinaryTree treeA;
    public BinaryTree treeB;

    public void Starter() {
        this.treeA = new BinaryTree(Node.simpleConstructor(Math.random()));
        this.treeB = new BinaryTree(Node.simpleConstructor(Math.random()));
    }
}