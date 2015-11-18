package lesson6.shapes;

public class Shape {

    public Shape() {
    }

    public void draw() {

        System.out.println("Draw shape");
    }

    public Shape[] fillShapeArr() {

        Shape[] shape = new Shape[4];
        shape[0] = new Shape();
        shape[1] = new Triangle();
        shape[2] = new Circle();
        shape[3] = new Rectangle();

        return shape;
    }
}
