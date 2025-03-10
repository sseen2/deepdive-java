package mission.figure2;

public class Triangle implements Figure {
    private final int width;
    private final int height;

    public Triangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void area() {
        System.out.println("삼각형의 면적은 " + (width * height / 2.0) + "입니다.");
    }
}
