package Object_Up.Action;

class Car{
    String color = "red";
    int num = 4;
    void show(){
        System.out.println("color=" + color + "num=" + num);
    }
}
class CarTest {
    public static void main(String[] args){
        Car c1= new Car();
        Car c2= new Car();
        c1.color = "blue";
        c1.show();
        c2.show();
    }
}
