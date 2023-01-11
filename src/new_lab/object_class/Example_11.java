package new_lab.object_class;
//Add two distances in inch-feet by creating a class named
//'AddDistance'.

class AddDistance{
    void add(int a,int b){
        System.out.println("addition of "+3 +" inch and "+4 +" inch is "+(a+b)+" inch");
    }
}

public class Example_11 {
    public static void main(String[] args) {
        AddDistance ad = new AddDistance();
        ad.add(3,4);
    }
}
