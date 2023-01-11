package ioStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Lab_02 {
    public static void main(String[] args) {
        try {
            File myobj = new File("C:\\Users\\Vishnu\\IdeaProjects\\Classroom\\src\\ioStream\\fisdemo.txt");
            Scanner myReader = new Scanner(myobj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            try{

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
