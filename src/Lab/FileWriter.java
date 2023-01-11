//package Lab;
//
//import java.io.*;
//
//public class FileWriter {
//
//    private static String getUserInputAsString()throws IOException{
//        String userInput ="";
//        InputStreamReader cin = null;
//        System.out.println("Enter input");
//
//        int studentCount;
//        try {
//            cin = new InputStreamReader(System.in);
//            System.out.println("enter the no. of student names you want to store followed by ");
//
//            System.out.println("Enter characters, '#' to quit.");
//            char c ;
//            do {
//                c =(char) cin.read();
//
//                if (c != '#') {
//                    userInput = userInput + c;
//                }
////                System.out.println(c);
//
//            } while(c != '#');
//        }finally {
//            if (cin != null) {
//                cin.close();
//            }
//        }
//
//        return "";
//    }
//
//    private static String[] getStudentNames()throws IOException, NumberFormatException {
//        String[] studentNms = null;
//        int studentCount;
//        System.out.println("Enter the student count followed by'#'");
//        try {
//            studentCount = Integer.parseInt(getUserInputAsString(cin).strip());
//            System.out.println("count :" + studentCount);
//            studentNms = new String[studentCount];
//            System.out.println("Enter student names separated by a , ");
//            String studentNnAsString = getUserInputAsString();
//            System.out.println(studentNnAsString);
//            studentNms = studentNnAsString.split(",");
//
//            return studentNms;
//        }
//    }
//
//
//    public static void main(String args[]) {
//
//        try{
//              getStudentNames();
//            //getUserInputAsString();
//        }catch (IOException ioe){
//            System.out.println("IO Exception occured :"+ioe);
//        }catch (NumberFormatException nfe){
//            System.out.println("Not s valid number "+nfe);
//        }catch (Exception e){
//            System.out.println("Exception: "+e);
//        }
//    }
//}// student count and student name in text file ....s
