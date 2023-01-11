package new_lab.assignment_04;
/*Write a program by creating an 'Employee' class having the following
methods and print the final salary.
1 - 'getInfo()' which takes the salary, number of hours of work per day of
employee as parameter
2 - 'AddSal()' which adds $10 to salary of the employee if it is less than $500.
3 - 'AddWork()' which adds $5 to salary of employee if the number of hours
of work per day is more than 6 hours.*/

import java.util.Scanner;

public class Employee {
    int salary;
    int hours;

    public void print(){
        addSal();
        addWork();
        System.out.println("final salary :-"+salary);
    }

    public void addSal(){
        if(salary<500){
            salary+=10;
        }
    }

    public void addWork(){
        if(hours>6){
            salary+=5;
        }
    }

    public void getInfo(int h, int s){
        this.salary= s;
        this.hours = h;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter no of hours");
        int h = scn.nextInt();
        System.out.println("Enter salary");
        int s = scn.nextInt();
        Employee e1 = new Employee();
        e1.getInfo(h,s);
        e1.print();

    }
}
