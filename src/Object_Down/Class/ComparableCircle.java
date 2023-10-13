package Object_Down.Class;

public class ComparableCircle extends Circle implements CompareObject {
    public int compareTo(Object o) {
        int flag = 0;
        if (o instanceof Circle) {
            Circle c = (Circle) o;
            if(c.getRedius() == this.getRedius()) {
                flag = 1;
            }
        }
        return flag;
    }
}
