package mission.figure;

public class Figure {
    private final FigureType figureType;
    private final int width;
    private final int length;

    public Figure(FigureType figureType, int width, int length) {
        this.figureType = figureType;
        this.width = width;
        this.length = length;
    }

    public void printArea() {
        double area = getArea();
        if (area == -1) {
            System.out.println("없는 도형 종류입니다.");
            return;
        }
        System.out.println(figureType.getFigureString() + "의 면적은 " + area + "입니다.");
    }

    private double getArea() {
        if (figureType == FigureType.CIRCLE) {
            double radius = (double) width / 2.0;
            return radius * radius * 3.14;
        }
        if (figureType == FigureType.TRIANGLE) {
            return (width * length) / 2.0;
        }
        if (figureType == FigureType.RECTANGLE) {
            return width * length;
        }
        return -1;
    }
}
