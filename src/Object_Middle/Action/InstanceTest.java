package Object_Middle.Action;

import Object_Middle.Class.Graduate;
import Object_Middle.Class.Person;
import Object_Middle.Class.Student;

public class InstanceTest {
    public static void main(String[] args) {
        Person person = new Graduate();
        method(person);
    }

    public static void method(Person e) {
        System.out.println(e.getInfo());

        System.out.println("a person");
        if (e instanceof Student) {
            System.out.println("a student");
        }
        if (e instanceof Graduate) {
            System.out.println("a graduated student");
        }
    }
}
