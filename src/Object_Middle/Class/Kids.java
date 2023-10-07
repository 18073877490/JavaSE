package Object_Middle.Class;

public class Kids extends ManKind {
    public int yearsOld;

    public void printAge() {
        System.out.println(yearsOld);
    }

    @Override
    public void employeed() {
        System.out.println("Kids should study and no job.");

    }
}
