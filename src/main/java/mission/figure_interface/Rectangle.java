package mission.figure_interface;

public class Rectangle implements Figure {
    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void area() {
        System.out.println("직사각형의 면적은 " + (width * height) + "입니다.");
    }
}
