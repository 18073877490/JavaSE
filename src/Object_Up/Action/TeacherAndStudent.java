package Object_Up.Action;

import Object_Up.Class.Student;
import Object_Up.Class.Teacher;

public class TeacherAndStudent {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name = "黄思奇";
        teacher.age = 38;
        teacher.teachAge = 12;
        teacher.course = "数学";
        Student student = new Student();
        student.name = "黄思捷";
        student.age = 13;
        student.major = "数学";
        student.interests = "看小说";
        teacher.say();
        student.say();
    }
}
