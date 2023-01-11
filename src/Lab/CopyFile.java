import java.io.*;
public class CopyFile {
    public static void main(String args[]) throws IOException {

//        FileReader readObj = null;//sub class extends reader and writer
//        FileWriter writeBbj = null;
        Reader readObj = null;//main class
        Writer writeBbj = null;

        try {
            readObj = new FileReader("C:\\Users\\Vishnu\\IdeaProjects\\ioStream\\src\\input.txt");
            writeBbj = new FileWriter("C:\\Users\\Vishnu\\IdeaProjects\\ioStream\\src\\output.txt");
            int c;
            while ((c = readObj.read()) != -1) {
                writeBbj.write(c);
            }
        }catch(IOException ioe){
            System.out.println("IOException occurred"+ioe);
        }

        finally {
            if (readObj != null) {
                readObj.close();
            }
            if (writeBbj != null) {
                writeBbj.close();
            }
        }
    }
}