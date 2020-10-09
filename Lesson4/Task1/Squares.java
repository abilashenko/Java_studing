package Lesson4.Task1;

public class Squares {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Triangle(4.7, 5.8, 10);
        shape[1] = new Circle(10);
        shape[2] = new Rectangle(5.5, 7.25);
        for (Shape sh: shape){
            System.out.println("Площадь фигуры: "+sh.square());
        }
    }
}
