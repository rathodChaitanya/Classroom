package Practice;

public class Course implements Cloneable{

    private  String sub1;
    private  String sub2;
    private  String sub3;

    public Course(String sub1,String sub2,String sub3) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
