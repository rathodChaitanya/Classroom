package Lab;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamExample2 {
    public static void main(String args[]) throws IOException {
        FileInputStream fin=null;
        BufferedInputStream bin=null;
        byte myarr[]=null;
        int filesizeinbytes;
        try{
            fin = new FileInputStream("C:\\Users\\Vishnu\\IdeaProjects\\Classroom\\src\\Lab\\c.txt");
            bin = new BufferedInputStream(fin);
            int i;
            String fileContent = "";
            while((i=bin.read())!=-1){
                System.out.print((char)i);
                fileContent+=(char)i;
            }
            System.out.println(fileContent);
            filesizeinbytes = bin.available();
            System.out.println("file size in (In Bytes)"+filesizeinbytes);
            bin.close();
            fin.close();
        }catch(Exception e){System.out.println(e);}
    }
}
