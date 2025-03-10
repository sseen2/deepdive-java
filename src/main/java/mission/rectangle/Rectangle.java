package mission.rectangle;

public class Rectangle {
    private final int width;
    private final int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int extent() {
        return width * length;
    }

    public int perimeter() {
        return (2 * width) + (2 * length);
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }
}
