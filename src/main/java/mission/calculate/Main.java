package mission.calculate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== 계산기 프로그램 =====");
        System.out.println("첫번째 숫자를 입력해주세요 :");
        String firstNum = sc.nextLine();
        System.out.println("두번째 숫자를 입력해주세요 : ");
        String secondNum = sc.nextLine();

        Calculator calculator = new Calculator(firstNum, secondNum);
        calculator.calculate();
    }
}
