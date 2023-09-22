package Array;

import java.util.Scanner;

public class ArrayTest5 {
    public static void main(String[] args) {
        int[] arr1 = new int[31];
        int[] arr2 = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr2.length; i++) {
            int num = (int) (Math.random() * 30);
            while (arr1[num] != 0) {
                System.out.println("该数字已经重复，请重新输入：");
                num = (int) (Math.random() * 30);
            }
            arr2[i] = num;
            arr1[num] = 1;
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + "\t");
        }
    }
}
