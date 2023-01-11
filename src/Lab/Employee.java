package Lab;

public class Employee {
    int empId;
    String name;

    public void setData(int c, String d){
        empId = c;
        name = d;
    }

    public void showData(){
        System.out.println("EmpId ="+empId+" "+"Emoployee Name = "+name);
        System.out.println();
    }
}
