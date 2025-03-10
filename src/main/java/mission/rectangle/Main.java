package mission.rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("직사각형의 너비를 입력해주세요");
        int width = sc.nextInt();
        System.out.println("직사각형의 길이를 입력해주세요");
        int height = sc.nextInt();

        Rectangle rectangle = new Rectangle(width, height);

        System.out.println("직사각형의 너비 : " + rectangle.getWidth());
        System.out.println("직사각형의 길이 : " + rectangle.getHeight());
        System.out.println("직사각형의 둘레 : " + rectangle.perimeter());
        System.out.println("직사각형의 넓이 : " + rectangle.extent());
    }
}
