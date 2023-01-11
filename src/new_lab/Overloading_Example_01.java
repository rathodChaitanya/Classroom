package new_lab;
/*Write a Program to use a single method name say large() to perform different activities.
(find largest number and smallest number.)
( use the concept of method overloading)
*/

public class Overloading_Example_01 {

    void add(int a, int b){
        System.out.println("sum = "+(double)(a+b));
    }

    void  add(double a, double b){
        System.out.println("sum = "+(int)(a+b));
    }

    public static void main(String[] args){
        Overloading_Example_01 ad=new Overloading_Example_01();
        int a = 4;
        int b = 5;
        ad.add(a,b);
        ad.add(5.4,7.2);
    }
}
