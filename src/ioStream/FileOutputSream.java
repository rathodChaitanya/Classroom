package ioStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputSream {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Vishnu\\IdeaProjects\\Classroom\\src\\ioStream\\fisdemo.txt");
        fos.write('s');
        fos.write('s');
        fos.write('s');
        System.out.println("DATA written in file");
    }
}
