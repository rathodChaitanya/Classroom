import java.io.*;
public class InputStreamReaderClass {
    public static void main(String args[]) throws IOException {
        InputStreamReader cin = null;
        try {
            cin = new InputStreamReader(System.in);
            System.out.println("Enter characters, '#' to quit.");
            char c ;
            int i;
            char temp ='#';
            int hasASCII = temp;
           // System.out.println("#"+(int)'#');
            do {
//                c = (char) cin.read();
                i = cin.read();
                c = (char)i;
                if(c!='#')
                    System.out.println(c);
//                System.out.print(c);
//                System.out.print((char)i);

            } while(c != '#');
        }finally {
            if (cin != null) {
                cin.close();
            }
        }
    }
}
//WAP where u use inputstream reader to fetch student name and store in file student .txt using filewriter