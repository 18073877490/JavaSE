package Object_Middle.Class;

public class Student extends Person {
    public String school = "cqupt";

    @Override
    public String getInfo() {
        return "Name: " + name + "\n" + "age: " + age +
                "\nschool: " + school;
    }
}
