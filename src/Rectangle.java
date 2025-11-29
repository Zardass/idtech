import java.sql.SQLOutput;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void getArea(){
        System.out.println("Area of Rectangle: " + this.length * this.width);
    }
    public void getPerimeter(){
        System.out.println("Perimeter of Rectangle: " + (2 * (this.length + this.width)));
    }
}
