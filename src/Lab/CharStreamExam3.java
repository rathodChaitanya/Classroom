import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CharStreamExam3 {
    public static void main(String args[]) throws IOException {
        ;
        Reader readObj = null;//main class
        Writer writeBbj = null;
        final String INPUT_FILE_NAME = "input.txt";
        final String OUTPUT_FILE_NAME = "output.txt";
        char[] fileContent = new char [130];
        final String folderPath = "C:\\Users\\Vishnu\\IdeaProjects\\ioStream\\src";

        try {
            // readObj = new FileReader(folderPath+INPUT_FILE_NAME);
            readObj = new FileReader(folderPath+INPUT_FILE_NAME);
            readObj.read(fileContent);
            System.out.println("filecontent"+fileContent.length);
            System.out.println("file content");
            String fileText ="";
            for (char temp:fileContent){
                fileText+=temp;
                System.out.println("filetext"+fileText);
            }
            System.out.println("filetext"+fileText);
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
