package Object_Middle.Action;

import java.util.Scanner;
import java.util.Vector;

public class PracticeTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector v = new Vector();

        int number = sc.nextInt();
        int max = number;
        int maxId = 0;
        while (number >= 0) {
            v.addElement(new Integer(number));
            if (number > max) {
                max = number;
                maxId = v.size() - 1;
            }
            number = sc.nextInt();
        }

        System.out.printf("最高分：%d 序号：%d\n", max, maxId);
        for (int i = 0; i < v.size(); i++) {
            int score = (int) v.elementAt(i);
            System.out.printf("序号：%d\t分数：%d\t等级：%c\n", i, score, getGrade(score, max));
        }

    }

    public static char getGrade(int score, int maxScore) {
        int scale = (maxScore - score) / 10;
        char grade;
        switch (scale) {
            case 0:
                grade = 'A';
                break;
            case 1:
                grade = 'B';
                break;
            case 2:
                grade = 'C';
                break;
            default:
                grade = 'D';
                break;
        }
        return grade;
    }
}
