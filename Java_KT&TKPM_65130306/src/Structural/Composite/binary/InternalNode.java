package Structural.Composite.binary;

public class InternalNode extends BinaryTreeComponent{
    BinaryTreeComponent left, right;

    public InternalNode(int value) {
        super(value);
    }

    @Override
    public void NRL() {
        System.out.println(value);
        if (left != null)
            left.NRL();
        if(right != null)
            right.NRL();
    }

    @Override
    public void addLeft(BinaryTreeComponent c) {
        left = c;
    }

    @Override
    public void addRight(BinaryTreeComponent c) {
        right = c;
    }
}
