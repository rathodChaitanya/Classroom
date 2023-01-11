package new_lab.object_class;
//Write a program that would print the information (name, year of joining,
//salary, address) of three employees by creating a class named 'Employee'.
//The output should be as follows:
//Name Year of joining Address
//Robert 1994 64C- WallsStreat
//Sam 2000 68D- WallsStreat
//John 1999 26B- WallsStreat

class Employee{
    String name;
    int yoj;
    String address;
}
public class Example_10 {
    public static void main(String[] args) {
        Employee s1 = new Employee();
        Employee s2 = new Employee();
        Employee s3 = new Employee();
        s1.name = "Robert";
        s1.yoj  = 1994;
        s1.address ="64C- WallsStreat";

        s2.name = "Sam";
        s2.yoj  = 2000;
        s2.address ="68D- WallsStreat";

        s3.name = "John";
        s3.yoj  = 1999;
        s3.address ="26B- WallsStreat";

        System.out.println("Name     Year of joining     Address");
        System.out.println(s1.name +"   "+s1.yoj+"                "+s1.address);
        System.out.println(s2.name +"      "+s2.yoj+"                "+s2.address);
        System.out.println(s3.name +"     "+s3.yoj+"                "+s3.address);
    }
}
