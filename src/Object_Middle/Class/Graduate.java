package Object_Middle.Class;

public class Graduate extends Student {
    public String major = "IT";

    @Override
    public String getInfo() {
        return "Name: " + name + "\n" + "age: " + age +
                "\nschool: " + school + "\nmajor: " + major;

    }

    public String getName() {
        return name;
    }
}
