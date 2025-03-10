package mission.figure1;

public class Main {
    public static void main(String[] args) {
        mission.figure1.Figure[] figureArr = new mission.figure1.Figure[3];

        figureArr[0] = new mission.figure1.Figure(mission.figure1.FigureType.RECTANGLE, 20, 5);
        figureArr[1] = new mission.figure1.Figure(mission.figure1.FigureType.TRIANGLE, 3, 5);
        figureArr[2] = new mission.figure1.Figure(mission.figure1.FigureType.CIRCLE, 20, 20);

        for (mission.figure1.Figure f : figureArr) {
            f.printArea();
        }
    }
}
