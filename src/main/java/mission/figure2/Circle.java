package mission.figure2;

public class Circle implements Figure {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public void area() {
        System.out.println("원의 면적은 " + (radius * radius * 3.14) + "입니다.");
    }
}
