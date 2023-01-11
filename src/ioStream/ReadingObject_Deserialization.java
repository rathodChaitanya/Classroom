package ioStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadingObject_Deserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("accountinfo.ser"));

        BankAccount acc =(BankAccount) ois.readObject();
        System.out.println("\nDe-Serializaton starts");
        System.out.println(acc);
        System.out.println("\nDe-Serializaton ends");
    }
}
