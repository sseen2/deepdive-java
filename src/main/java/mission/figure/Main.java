package mission.figure;

public class Main {
    public static void main(String[] args) {
        Figure[] figureArr = new Figure[3];

        figureArr[0] = new Figure(FigureType.RECTANGLE, 20, 5);
        figureArr[1] = new Figure(FigureType.TRIANGLE, 3, 5);
        figureArr[2] = new Figure(FigureType.CIRCLE, 20, 20);

        for (Figure f : figureArr) {
            f.printArea();
        }
    }
}
