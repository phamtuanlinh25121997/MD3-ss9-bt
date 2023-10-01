package b2;

public class Square implements Colorable{
    private double hight;

    public Square(double hight) {
        this.hight = hight;
    }

    public double getSide() {
        return hight;
    }

    public void setSide(double hight) {
        this.hight = hight;
    }

    public double getArea() {
        return Math.pow(hight, 2);
    }
    @Override
    public void howToColor(){
        System.out.println("Color all four sides");
    }
}
