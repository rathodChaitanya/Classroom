package new_lab.assignmnt_03;

import java.util.Scanner;

public class Matrix_2D {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Please enter 10 integers");

        int array[][]= new int[2][5];

        for(int i=0; i<array.length; i++){

            int max= array[i][0];
            for(int j=0; j<array[i].length; j++){

                array[i][j]= input.nextInt();

                if(max<array[i][j]){

                    max= array[i][j];
                }
            }
            System.out.println("Maximum number in the row is "+ max);
            System.out.println();
        }

    }
}
