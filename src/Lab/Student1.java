package Lab;

import java.io.*;
import java.util.Scanner;

public class Student1 {

    public static int getInupt(){
        Scanner reader = null;
        FileWriter writer = null;
        FileReader reader1 = null;
        String inputText;
        int count=0;

        try {

            reader = new Scanner(System.in);
            writer = new FileWriter("C:\\Users\\Vishnu\\IdeaProjects\\Classroom\\src\\Lab\\student.txt");


            System.out.println("Enter Student Name : ");
            while (true) {
                inputText = reader.nextLine();
                if (inputText.equals("exit")) {
                    break;
                }
                count++;
                writer.write(inputText);
                writer.write("\n");

            }


        } catch (IOException e) {

            System.out.println("A fatal exception occurred!");

        } finally {

            if (reader != null) {
                reader.close();
            }

            try {

                if (writer != null) {
                    writer.close();
                }

            } catch (IOException e) {

                System.out.println("Closing was not successful.");

            }

        }

        return count;


    }

    public static void getOutput() throws IOException{
        int i;
        System.out.println("Printing from file");
        System.out.println();
        FileReader fr = new FileReader("C:\\Users\\Vishnu\\IdeaProjects\\Classroom\\src\\Lab\\student.txt");
        while ((i = fr.read()) != -1)

            System.out.print((char)i);
    }


    public static void main(String[] args) throws IOException {
       int a = getInupt();
       getOutput();
        System.out.println("count :" +a);
    }
}
