package Object_Up.Class;

public class Teacher {
    public String name;
    public int age;
    public int teachAge;
    public String course;

    public void say() {
        System.out.printf("老师的名称是：%s\t今年%d岁\n" +
                "教龄%d年\t所教科目为%s：\n", name, age, teachAge, course);
    }
}
