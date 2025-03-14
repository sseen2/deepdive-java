package mission.figure_array;

public class Figure {
    private final mission.figure_array.FigureType figureType;
    private final int width;
    private final int height;

    public Figure(mission.figure_array.FigureType figureType, int width, int height) {
        this.figureType = figureType;
        this.width = width;
        this.height = height;
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
        if (figureType == mission.figure_array.FigureType.CIRCLE) {
            double radius = (double) width / 2.0;
            return radius * radius * 3.14;
        }
        if (figureType == mission.figure_array.FigureType.TRIANGLE) {
            return (width * height) / 2.0;
        }
        if (figureType == mission.figure_array.FigureType.RECTANGLE) {
            return width * height;
        }
        return -1;
    }
}
