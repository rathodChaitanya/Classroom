import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ReaderStudents {
    public static void main(String[] args)throws IOException {
        InputStreamReader cin = null;
        try {
            cin = new FileReader("C:\\Users\\Vishnu\\IdeaProjects\\ioStream\\src\\student.txt");

            int n ;
            String read_Student="";


            while((n = cin.read()) != -1)
            {
                read_Student = read_Student+(char) n;
            }
            String[] arr= read_Student.split(",");

            for(String temp : arr){
                System.out.println(temp);
            }

        }finally {
            if (cin != null) {
                cin.close();
            }
        }
    }

}

