package mission.calculate;

public class Calculator {
    private final int firstNum;
    private final int secondNum;

    public Calculator(String firstNum, String secondNum) {
        this.firstNum = validateNumber(firstNum);
        this.secondNum = validateNumber(secondNum);
    }

    private int validateNumber(String num) {
        try {
            return Integer.parseInt(num);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("입력값이 숫자가 아닙니다.");
        }
    }

    public void calculate() {
        System.out.println("더하기 : " + (firstNum + secondNum));
        System.out.println("빼기 : " + (firstNum - secondNum));
    }
}
