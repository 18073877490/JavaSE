package Object_Up.Class;

public class Student {
    public String name;
    public int age;
    public String major;
    public String interests;

    public void say() {
        System.out.printf("学生的姓名是：%s\t今年%d岁\n" +
                "所学科目为：%s\t兴趣爱好有：%s\n", name, age, major, interests);
    }
}

