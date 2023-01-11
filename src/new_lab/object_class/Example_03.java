package new_lab.object_class;
//Assign and print the roll number, phone number and address of two
//students having names "Sam" and "John" respectively by creating two
//objects of class 'Student'.

class Student1{
    String name;
    int rollNo;
    long phoneNO;
    String address;
}

public class Example_03 {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        Student1 s2 = new Student1();
        s1.name = "John";
        s1.rollNo = 21;
        s1.phoneNO = 9876543214L;
        s1.address ="Akshya Nagar 1st Block 1st Cross, Rammurthy nagar, Bangalore-560016";

        s2.name = "Sam";
        s2.rollNo = 21;
        s2.phoneNO = 9876543214L;
        s2.address ="Akshya Nagar 1st Block 1st Cross, Rammurthy nagar, Bangalore-560016";

        System.out.println("\n name : "+s1.name +"\n roll no :"+s1.rollNo+"\n phone no :"+s1.phoneNO+"\n Adderess :"+s1.address);
        System.out.println("\n name : "+s2.name +"\n roll no :"+s2.rollNo+"\n phone no :"+s2.phoneNO+"\n Adderess :"+s2.address);

    }
}
