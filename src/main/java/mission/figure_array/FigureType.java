package mission.figure_array;

public enum FigureType {
    RECTANGLE("직사각형"),
    TRIANGLE("삼각형"),
    CIRCLE("원");

    private final String figureString;

    private FigureType(String figureString) {
        this.figureString = figureString;
    }

    public String getFigureString() {
        return figureString;
    }
}
