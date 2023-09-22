package Array;

import java.util.Scanner;

public class ArrayTest7 {
    public static void main(String[] args) {
//        初始化有序数组
        int[] arr = new int[]{1, 3, 5, 7, 9, 11, 13, 15};
        boolean Flag = false;
//        输入number
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int head = 0;
        int end = arr.length - 1;
//        二分查找
        while (head <= end) {
            int middle = (head + end) / 2;
            if (arr[middle] == number) {
                System.out.println("找到指定元素，索引为：" + middle);
                Flag = true;
                break;
            } else if (number > arr[middle]) {
                head = middle + 1;
            } else if (number < arr[middle]) {
                end = middle - 1;
            }
        }
        if (!Flag) {
            System.out.println("未找到指定元素");
        }
    }
}
