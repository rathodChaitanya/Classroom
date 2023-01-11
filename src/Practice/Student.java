package Practice;

public class Student implements Cloneable{
    int id;
    String name;
    Course course;

    public Student(int id,String name,Course course) {
        this.id = id;
        this. name = name;
        this.course = course;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student std = (Student) super.clone();
        std.course = (Course) course.clone();
        return std;
    }


    @Override
    public String toString() {
        return "id "+id +"name "+name ;
    }
}
