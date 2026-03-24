package Structural.Composite.binary;

public class Left extends BinaryTreeComponent {
    public Left(int value) {
        super(value);
    }

    @Override
    public void NRL() {
        System.out.println(value);
    }

    @Override
    public void addLeft(BinaryTreeComponent c) {

    }

    @Override
    public void addRight(BinaryTreeComponent c) {

    }
}
