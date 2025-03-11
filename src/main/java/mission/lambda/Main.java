package mission.lambda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 숫자를 입력해주세요");
        int num1 = sc.nextInt();
        System.out.println("두번째 숫자를 입력해주세요");
        int num2 = sc.nextInt();

        Calculator.Sum sum = (x, y) -> x + y;
        Calculator.Minus minus = (x, y) -> x - y;
        Calculator.Multiple multi = (x, y) -> x * y;
        Calculator.Divide divide = (x, y) -> x / y;

        System.out.println("더하기 결과 : " + sum.sum(num1, num2));
        System.out.println("빼기 결과 : " + minus.minus(num1, num2));
        System.out.println("곱하기 결과 : " + multi.multiple(num1, num2));
        System.out.println("나누기 결과 " + divide.divide(num1, num2));
    }
}
