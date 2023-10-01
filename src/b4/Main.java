package b4;

public class Main {
    public static void main(String[] args) {

        Shape shape1 = new Circle("blue",10);
        System.out.println("Hình tròn: ");
        shape1.getArea();
        System.out.println("--------------------------------");
        Shape shape2 = new Rectangle("black", 10,5);
        System.out.println("Hình chữ nhật: ");
        shape2.getArea();
    }
}
