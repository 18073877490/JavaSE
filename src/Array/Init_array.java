package Array;

public class Init_array {
    public static void main(String[] args){
        int[] arr = new int[3];
        arr[0] = 3;
        arr[2] = 4;
        arr[1] = 5;
        String[] names;
        names = new String[]{"张三","李四","王五"};
        for(int i = 0; i < arr.length; i++){
            System.out.println(names[i] + " = " + arr[i]);
        }
//        数组一旦初始化，其长度是不可变的。
    }
}
