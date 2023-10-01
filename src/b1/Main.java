package b1;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape(2,5);
        System.out.println("CHu vi trước: "+shape.getPerimeter());
        System.out.println("Diện tích trước: " + shape.getArea());
        shape.resize(shape.getHeight());

    }


}
