package ioStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WritingObject_Serialization {
    public static void main(String[] args) throws IOException {

        BankAccount acc1 = new BankAccount();

        acc1.setBankName("ICICI");
        acc1.setBranchName("SRNagar");
        acc1.setIfsc("IC453");

        System.out.println(acc1);
        acc1.setAccNum(1234);
        acc1.setAccHName("HK");
        acc1.setBalance(100000);
        acc1.setUsername("hari");
        acc1.setPassword("nit");
        acc1.setAccType("Saving");
        System.out.println(acc1);

        // above method sone security probleam so thats why we use serialization

        //Serializaton starts
        System.out.println("\nSerializaton starts");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("accountinfo.ser"));
        oos.writeObject(acc1);
        System.out.println("Serializaton end");
        System.out.println("acc object state is saved in file successfully");
    }
}
