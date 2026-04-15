package Structural.decorator.beverage;

public abstract class Beverage {
    String description; //biến lưu tên đồ uống

    public Beverage(String description) {
        this.description = description;
    }

    //hàm tính tiền để các lớp tự đinhj nghĩa
    public abstract int cost();

    //trả về tên đồ uống
    public String getDescription() {
        return description;
    }
}
