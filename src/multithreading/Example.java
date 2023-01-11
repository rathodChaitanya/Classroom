package multithreading;
import java.lang.Thread;
import java.io.*;

public class Example extends Thread{

    private  String name;
    Example(String name){
        this.name = name;
    }

    @Override
    public void run(){
        System.out.println("Thread is running");
        System.out.println("Name : "+name);
    }
    public static void main(String[] args) {
        Example ex1 = new Example("Chaitanya");
        Example ex2 = new Example("Priya");
        Example ex3 = new Example("vishnu");

        ex3.start();
        ex2.start();
        ex1.start();
    }
}
