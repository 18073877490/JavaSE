package Array;

public class ArrayTest6 {
    public static void main(String[] args) {
        int[] array1 = new int[]{2, 3, 5, 7, 11, 13, 17, 19};
        System.out.println("array1:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }
        System.out.println();
        System.out.println("array2:");
        int[] array2 = array1;
        array2[0] = 0;
        array2[2] = 2;
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + "\t");
        }
        System.out.println();
        System.out.println("arrary1:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }
    }
}
