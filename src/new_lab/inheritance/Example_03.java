package new_lab.inheritance;
/*Write a Program to inherit all the property of the
class vehicle into its derived class car and bus.
*/

class VehicLe{
    public void start() {
        System.out.println("starting the engine");
    }

    public void stop() {
        System.out.println("stopping the engine");
    }

}
class CaR extends VehicLe{
    void name(){
        System.out.println("Odi");
    }
    void capacity(){
        System.out.println("4");
    }
}
class Bus extends VehicLe {
    void name(){
        System.out.println("Volvo");
    }
    void capacity(){
        System.out.println("30");
    }
}
public class Example_03 {
    public static void main(String[] args) {
        CaR c = new CaR();
        Bus b = new Bus();
        c.name();
        c.capacity();
        c.start();
        c.stop();
        System.out.println();
        b.name();
        b.capacity();
        b.start();
        b.stop();
    }
}
