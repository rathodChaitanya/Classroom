package new_lab.inheritance;
//Write a Program to inherit all the property of the
//class vehicle into its derived class car.
class Vehicle {
    void model(){
        System.out.println("MFY4535");
    }
}
class Car extends Vehicle{
    void carModel(){
        System.out.println("Mustang");
    }
}

public class Example_02 {
    public static void main(String[] args) {
        Car c = new Car();
        c.carModel();
        c.model();
    }
}
