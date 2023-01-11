package new_lab.methods;

public class Serching {

    public static void search(int arr[],int n){
        boolean b =false;

        for (int i=0; i < arr.length; i++) {

            if(n == arr[i]) {
                System.out.println(n + " NO is present ");
                b = true;
                break;
            }

        }
        if(b==false) {
            System.out.println("No is not present in this array");
        }
    }

    public static void main(String[] args) {
        //Scanner scn = new Scanner(System.in);
        int arr[] = {2, 4, 5, 6, 7, 8};
        int n = 6;
        search(arr,n);
    }
}
