package new_lab.inheritance;

//Write a Program using class, where one class
//can inherit all the properties form the base class.
class Name{
    void add(){
        System.out.println("hello");
    }
}
class Dummy_Name extends Name{
    void name(){
        System.out.println("Sonya");
    }
}
class Real_Name extends Name{
    void name(){
        System.out.println("Chaitanya");
    }
}
public class Example_01 {
    public static void main(String[] args) {
        Real_Name r = new Real_Name();
        Dummy_Name r1 = new Dummy_Name();
        r.add();
        r.name();
        r1.add();
        r1.name();
    }
}
