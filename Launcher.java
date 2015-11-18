package lesson6.shapes;

public class Launcher {

    public static void main(String[] args) {

        Shape shape = new Shape();
        Shape[] shapeArr = shape.fillShapeArr();

        for (int i = 0; i < shapeArr.length; i++) {
            shapeArr[i].draw();
        }
    }
}
