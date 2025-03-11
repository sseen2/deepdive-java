package mission.figure_array;

public class Main {
    public static void main(String[] args) {
        mission.figure_array.Figure[] figureArr = new mission.figure_array.Figure[3];

        figureArr[0] = new mission.figure_array.Figure(mission.figure_array.FigureType.RECTANGLE, 20, 5);
        figureArr[1] = new mission.figure_array.Figure(mission.figure_array.FigureType.TRIANGLE, 3, 5);
        figureArr[2] = new mission.figure_array.Figure(mission.figure_array.FigureType.CIRCLE, 20, 20);

        for (mission.figure_array.Figure f : figureArr) {
            f.printArea();
        }
    }
}
