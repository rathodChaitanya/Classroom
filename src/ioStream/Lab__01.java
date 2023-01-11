package ioStream;

import java.io.File;
import java.io.IOException;

public class Lab__01 {
    public static void main(String[] args) {
        File myobj = new File("C:\\Users\\Vishnu\\IdeaProjects\\Classroom\\src\\ioStream\\Filename2.txt");
        if(myobj.exists()){
            System.out.println("File Created: "+myobj.getName());
        }else{
            System.out.println("File already exists.");
        }
    }
}
