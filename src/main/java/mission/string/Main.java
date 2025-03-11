package mission.string;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("문자열을 입력해주세요 ");
        String str = sc.nextLine();

        String reverseStr = new StringBuilder(str).reverse().toString();
        System.out.println("뒤집은 문자열 : " + reverseStr);

        StringBuilder resultStr = new StringBuilder();
        for (Character c : reverseStr.toCharArray()) {
            if (Character.isUpperCase(c)) {
                resultStr.append(Character.toLowerCase(c));
            }
            else if (Character.isLowerCase(c)) {
                resultStr.append(Character.toUpperCase(c));
            }
            else {
                resultStr.append(c);
            }
        }

        System.out.println("대소문자를 변환한 최종 문자열 : " + resultStr);
    }
}
