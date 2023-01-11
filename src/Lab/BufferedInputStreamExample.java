package Lab;

import java.io.*;
public class BufferedInputStreamExample{
    public static void main(String args[]) throws IOException{
        FileInputStream fin=null;
        BufferedInputStream bin=null;
        try{
            fin = new FileInputStream("C:\\Users\\Vishnu\\IdeaProjects\\Classroom\\src\\Lab\\c.txt");
            bin = new BufferedInputStream(fin);
            int i;
            while((i=bin.read())!=-1){
                System.out.print((char)i);
            }
            bin.close();
            fin.close();
        }catch(Exception e){System.out.println(e);}
    }
}