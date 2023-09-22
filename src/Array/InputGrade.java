package Array;

import java.util.Scanner;

public class InputGrade {
    public static void main(String[] args) {
        System.out.println("请输入学生的人数：");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        System.out.format("请输入%d个学生的成绩：\n", count);

        int score[] = new int[count];
        score[0] = sc.nextInt();
        int maxNum = score[0], id = 1;

        for (int i = 1; i < count; i++) {
            score[i] = sc.nextInt();
            if (score[i] >= maxNum) {
                maxNum = score[i];
                id = i + 1;
            }
        }
        System.out.println("最高分是：" + maxNum);
        for (int i = 0; i < count; i++) {
            System.out.format("student %d score is %d grade is %c\n", i + 1, score[i],
                    getGrade(maxNum, score[i]));
        }
    }

    static char getGrade(int maxNum, int score) {
        char grade;
        if (score >= maxNum - 10) {
            grade = 'A';
        } else if (score >= maxNum - 20) {
            grade = 'B';
        } else if (score >= maxNum - 30) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        return grade;
    }
}
