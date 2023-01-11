package Lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequnceStream {
    public static void main(String[] args) throws IOException {
        FileInputStream f1 = null;
        FileInputStream f2 = null;
        FileOutputStream o = null;
        SequenceInputStream s = null;

        try{
            f1 = new FileInputStream("C:\\Users\\Vishnu\\IdeaProjects\\Classroom\\src\\Lab\\a.txt");
            f2 = new FileInputStream("C:\\Users\\Vishnu\\IdeaProjects\\Classroom\\src\\Lab\\b.txt");
            o = new FileOutputStream("C:\\Users\\Vishnu\\IdeaProjects\\Classroom\\src\\Lab\\c.txt");
            s = new SequenceInputStream(f1,f2);

//            int i;
//            while((i=s.read())!=-1)
//            {
//                o.write(i);
//            }

            System.out.println("Read data from "+f1+" & "
                    +f2 +" using SequenceInputStream");

            int ch;
            while ((ch = s.read()) != -1) { // read till end of file of both files
                System.out.print((char) ch);
            }

        }finally {
            if(f1 != null){
                f1.close();
            }
            if(f2 != null){
                f2.close();
            }
            if(o != null){
                o.close();
            }
            if(s != null){
                s.close();
            }
        }
    }
}
