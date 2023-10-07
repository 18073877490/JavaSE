package Array;

import java.util.Scanner;

public class ArrayTest4 {
    //    s
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arry = new int[num][];
        for (int i = 0; i < num; i++) {
            arry[i] = new int[i + 1];
        }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    arry[i][j] = 1;
                } else {
                    arry[i][j] = arry[i - 1][j - 1] + arry[i - 1][j];
                }
            }
        }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.format("%d\t", arry[i][j]);
            }
            System.out.println();
        }
    }
}
