package mission.sort;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] unsortedArray = new int[5];
        System.out.println("5개의 정수를 입력해주세요: ");
        for (int i = 0; i < unsortedArray.length; i++) {
            unsortedArray[i] = scanner.nextInt();
        }

        System.out.println("===== 정렬 전 배열 =====");
        for(int i : unsortedArray)
            System.out.print(i + " ");
        System.out.println();

        Sort sort = new Sort();

        System.out.println();
        System.out.println("===== 버블 정렬 =====");
        sort.bubbleSort(unsortedArray);
        System.out.println("===== 선택 정렬 =====");
        sort.selectionSort(unsortedArray);
        System.out.println("===== 삽입 정렬 =====");
        sort.insertionSort(unsortedArray);
    }
}
