package mission.rectangle;

public class Rectangle {
    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int extent() {
        return width * height;
    }

    public int perimeter() {
        return (2 * width) + (2 * height);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
