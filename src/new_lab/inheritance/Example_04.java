package new_lab.inheritance;
/*Write a Program to inherit only one property of
the class vehicle into its derived class car.*/
class Vehicel1{
    public void start() {
        System.out.println("starting the engine");
    }

    public void stop() {
        System.out.println("stopping the engine");
    }

}
class Car1 extends Vehicel1{
    void name(){
        System.out.println("Odi");
        super.start();
    }
    void capacity(){
        System.out.println("4");
    }
}
public class Example_04 {
    public static void main(String[] args) {
        Car1 c = new Car1();

        c.name();
        c.capacity();
    }
}
