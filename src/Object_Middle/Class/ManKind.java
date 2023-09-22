package Object_Middle.Class;

public class ManKind {
    public int sex;
    public int salary;

    public void manOrWoman() {
        switch (sex) {
            case 0:
                System.out.println("Woman");
                break;
            case 1:
                System.out.println("Man");
                break;
            default:

        }
    }

    public void employeed() {
        switch (salary) {
            case 0:
                System.out.println("no job");
                break;
            case 1:
                System.out.println("job");
            default:
        }
    }

}
