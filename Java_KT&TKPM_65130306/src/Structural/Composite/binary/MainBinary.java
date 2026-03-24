package Structural.Composite.binary;

public class MainBinary {
    public static void main(String[] args){
        BinaryTreeComponent n1 = new InternalNode(10);
        BinaryTreeComponent n2 = new InternalNode(5);
        BinaryTreeComponent n3 = new InternalNode(6);
        BinaryTreeComponent n4 = new InternalNode(4);
        BinaryTreeComponent n5 = new InternalNode(3);
        BinaryTreeComponent n6 = new InternalNode(9);
        BinaryTreeComponent n7 = new InternalNode(7);
        n1.addLeft(n2);
        n1.addRight(n3);
        n2.addLeft(n4);
        n2.addRight(n5);
        n3.addLeft(n6);
        n3.addRight(n7);
        n1.NRL();
    }
}
