package ioStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class FileCopy{
    public static void copyFile(String scrFile, String destFile) throws FileNotFoundException,IOException {
        FileInputStream fin = new FileInputStream(scrFile);
        FileOutputStream fout = new FileOutputStream(destFile);
        int i;
        while((i = fin.read())!= -1){
            fout.write(i);
        }
        System.out.println("copy completed "+ destFile);
    }
}

public class FOSCopy {
    public static void main(String[] args) throws IOException {
        try{
            FileCopy.copyFile(args[0],args[1]);
        }catch (ArrayIndexOutOfBoundsException aeiob){
            System.out.println("Error : Please pass source and destination file names");
            System.out.println("Usage : java FOSCopy abc.txt,xyz.txt");
        }
    }

}
