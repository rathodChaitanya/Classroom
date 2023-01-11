package ioStream;

import java.io.FileInputStream;

public class DataInputStream {
    public DataInputStream(FileInputStream fin) {
    }

    public static void main(String[] args)throws Exception {

        FileInputStream fin = new FileInputStream("C:\\Users\\Vishnu\\IdeaProjects\\Classroom\\src\\ioStream\\xyz.txt");
        DataInputStream din = new DataInputStream(fin);
    }
}
