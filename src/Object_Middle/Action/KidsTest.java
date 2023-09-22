package Object_Middle.Action;

import Object_Middle.Class.Kids;

public class KidsTest {
    public static void main(String[] args) {
        Kids kid = new Kids();
        kid.yearsOld = 23;
        kid.printAge();

        kid.sex = 1;
        kid.salary = 0;
        kid.manOrWoman();
        kid.employeed();
    }
}
