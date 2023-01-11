package Lab;

import java.io.*;
import java.util.Scanner;

public class Student {

    public static int getInupt(){
        Scanner reader = null;
        FileWriter writer = null;
        FileReader reader1 = null;
        String inputText;
        int count=0;

        try {

            reader = new Scanner(System.in);
            writer = new FileWriter("C:\\Users\\Vishnu\\IdeaProjects\\ioStream\\src\\student.txt");


            System.out.println("Enter Student No : ");
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
        System.out.println();
        System.out.println("Printing from file");
        System.out.println();
        FileReader fr = new FileReader("C:\\Users\\Vishnu\\IdeaProjects\\ioStream\\src\\student.txt");
        while ((i = fr.read()) != -1)

            System.out.print((char)i);
    }

    public static void cin(){
        Scanner reader = null;
        FileWriter writer = null;
        FileReader reader1 = null;
        String inputText;
        int count=0;

        try {

            reader = new Scanner(System.in);
            writer = new FileWriter("C:\\Users\\Vishnu\\IdeaProjects\\ioStream\\src\\c.txt");


            System.out.println("Enter No : ");
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
    }

    public static void cout() throws IOException{
        int j;
        System.out.println("Printing  count from file");
       try {
           FileReader r = new FileReader("C:\\Users\\Vishnu\\IdeaProjects\\ioStream\\src\\c.txt");
           while ((j = r.read()) != -1)

               System.out.print((char) j);
       }catch (FileNotFoundException fne){
           System.out.println("file not found");
       }catch (IOException io){
           System.out.println("input file not fount");
       }
    }

    public static void main(String[] args) throws IOException {
        int a = getInupt();
        getOutput();
        System.out.println();
        System.out.println("count :" +a);
    }
}
