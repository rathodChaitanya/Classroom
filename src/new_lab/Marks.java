package new_lab;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Maths marks :");
        int a = scn.nextInt();
        System.out.println("Enter Science Marks :");
        int b = scn.nextInt();
        System.out.println("Enter History Marks :");
        int c = scn.nextInt();
        System.out.println("Enter Geography Marks :");
        int d = scn.nextInt();
        System.out.println("Enter Sanskrut Marks :");
        int e = scn.nextInt();
        System.out.println("Enter Hindi Marks :");
        int f = scn.nextInt();
        System.out.println();
        System.out.println("1) Maths marks : "+a);
        System.out.println("2) Science Marks : "+b);
        System.out.println("3) History Marks : "+c);
        System.out.println("4) Geography Marks : "+d);
        System.out.println("5) Sanskrut Marks : "+e);
        System.out.println("6) Hindi Marks : "+f);
    }
}
