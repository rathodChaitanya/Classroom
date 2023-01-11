package ioStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class New_copy {
    public static void main(String[] args) throws IOException {
        try(
            FileReader fr = new FileReader("C:\\Users\\Vishnu\\IdeaProjects\\Classroom\\src\\ioStream\\abc.txt");
            FileWriter fw = new FileWriter("C:\\Users\\Vishnu\\IdeaProjects\\Classroom\\src\\ioStream\\xyz.txt");
        ) {
            fr.transferTo(fw);
        }
        finally {
            System.out.println("OK");
        }
    }
}
