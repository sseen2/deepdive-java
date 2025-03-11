package mission.figure_abstract;

public class Main {
    public static void main(String[] args) {
        // 추상 클래스를 구현
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(3, 5);
        // 인터페이스로 구현
        Rectangle rectangle = new Rectangle(2, 10);

        circle.area();
        triangle.area();
        rectangle.area();
    }
}
