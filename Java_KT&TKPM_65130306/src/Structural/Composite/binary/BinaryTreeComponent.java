package Structural.Composite.binary;

public abstract class BinaryTreeComponent {
    int value;

    public BinaryTreeComponent(int value) {
        this.value = value;
    }

    protected BinaryTreeComponent() {
    }

    public abstract void NRL();
    public abstract void addLeft(BinaryTreeComponent c);
    public abstract void addRight(BinaryTreeComponent c);
}
