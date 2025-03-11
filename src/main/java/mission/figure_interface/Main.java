package mission.figure_interface;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(3, 5);
        Rectangle rectangle = new Rectangle(2, 10);

        circle.area();
        triangle.area();
        rectangle.area();
    }
}
