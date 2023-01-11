package ioStream;

import java.io.FileOutputStream;

public class DataOutputStream {
    public static void main(String[] args)throws Exception {
        FileOutputStream  fos = new FileOutputStream("C:\\Users\\Vishnu\\IdeaProjects\\Classroom\\src\\ioStream\\abc.txt");
        java.io.DataOutputStream dos = new java.io.DataOutputStream(fos);

        dos.writeInt(97);
        dos.writeFloat(111.3f);
        dos.writeBoolean(true);
        dos.writeUTF("Chaitanya");
        System.out.println("Data written to file");
    }
}
