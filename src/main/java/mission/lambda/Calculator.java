package mission.lambda;

public interface Calculator {
    @FunctionalInterface
    public interface Sum {
        int sum(int a, int b);
    }

    @FunctionalInterface
    public interface Minus {
        int minus(int a, int b);
    }

    @FunctionalInterface
    public interface Multiple {
        int multiple(int a, int b);
    }

    @FunctionalInterface
    public interface Divide {
        int divide(int a, int b);
    }
}
