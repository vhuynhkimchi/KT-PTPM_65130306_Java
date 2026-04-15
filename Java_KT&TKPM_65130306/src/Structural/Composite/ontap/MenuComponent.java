package Structural.Composite.ontap;

public abstract class MenuComponent {
    String name;
    public MenuComponent(String name) { this.name = name; }

    public abstract int getPrice(); // Hàm quan trọng để tính giá
    public abstract void display(String tab); // Hàm hiển thị

    public void add(MenuComponent c) {
        throw new UnsupportedOperationException("Không hỗ trợ thêm vào món đơn");
    }
}
