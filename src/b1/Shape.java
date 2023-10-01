package b1;

public class Shape implements Resizeable{
    private double width;
    private double height;

    public Shape() {
    }

    public Shape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String display() {
        return "width = " + width + " height = " + height;
    }

    public String getArea() {
        return "Diện tích: " + height * width;
    }

    public String getPerimeter() {
        return "Chu vi là : " + (2 * (width + height));
    }

    @Override
    public void resize(double percent) {
        percent = Math.floor(Math.random() * 100);
        System.out.println(percent);
        System.out.println("Chu vi là : " + (2 *percent*(width + height)));
        System.out.println("Diện tích: " + percent*height * width);
    }
}
