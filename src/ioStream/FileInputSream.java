package ioStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputSream {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\Vishnu\\IdeaProjects\\Classroom\\src\\ioStream\\fisdemo.txt");


        int i;
        while((i = fis.read())!= -1){
            System.out.println(i+" ");
            System.out.println((char)i);
        }
    }
}
