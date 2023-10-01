package b4;

public class Rectangle extends Shape{
    private int width;
    private int height;

    public Rectangle() {
    }

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void getArea() {
        super.getArea();
        System.out.println(super.display());
        System.out.println("Diện tích: "+ (width*height));
    }
}
