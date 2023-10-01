package b4;

public class Circle extends Shape{
    private int radius;

    public Circle() {
    }

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void getArea() {
        super.getArea();
        System.out.println(super.display());
        System.out.println("Diện tích: "+(Math.pow(radius,2)*Math.PI));
    }
}
