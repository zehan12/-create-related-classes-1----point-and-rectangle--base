import java.awt.*;
public class Rectangle {
    // write the code of rectangle class here
    Point topLeft;
    int height;
    int width;

    public Rectangle(Point t, int h, int w) {
        this.topLeft = t;
        this.height = h;
        this.width = w;
    }

    public boolean display() {
        System.out.println(this.width);
//        return this.topLeft;
        return false;
    }

    public static void main(String[] args) {
        Point t = new Point(444,2);
        Rectangle rect = new Rectangle(t,3,3);
        System.out.println(rect.display());
    }
}
