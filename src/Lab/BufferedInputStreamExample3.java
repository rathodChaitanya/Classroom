package Lab;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamExample3 {
    public static void main(String args[]) throws IOException {
        FileInputStream fin=null;
        BufferedInputStream bin=null;
        byte myarr[]=null;
        int filesizeinbytes;
        try{
            fin = new FileInputStream("C:\\Users\\Vishnu\\IdeaProjects\\Classroom\\src\\Lab\\c.txt");
            bin = new BufferedInputStream(fin);
            filesizeinbytes = bin.available();
            myarr = new byte[filesizeinbytes];
            bin.read(myarr);
            System.out.println("file size in (In Bytes)"+filesizeinbytes);
            bin.read(myarr);
            bin.close();
            fin.close();
        }catch(Exception e){System.out.println(e);}
         if(myarr.length>0){
             for (byte ele:myarr) {
                 System.out.println((char)ele);
             }
         }
    }
}
