package new_lab.object_class;
//Write a program to print the area of two rectangles having sides (4,5)
//and (5,8) respectively by creating a class named 'Rectangle' with a method
//named 'Area' which returns the area and length and breadth passed as
//parameters to its constructor

class Rectangle{
    double lenght,breadth;
    public Rectangle(double lenght,double breadth){
        this.breadth=breadth;
        this.lenght=lenght;
    }

    void Area(){
        System.out.println("Area of rectangle "+(lenght*breadth));
    }
}

public class Example_06 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4,5);
        Rectangle r2 = new Rectangle(5,8);
        r1.Area();
        r2.Area();
    }
}
