package b4;

public abstract class Shape {
    private String color;

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public void getArea(){};
    public String display() {
        return "Màu: " + color;    }
}
