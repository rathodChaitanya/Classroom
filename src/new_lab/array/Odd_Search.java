package new_lab.array;

public class Odd_Search {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,7,2,6,8,9,4,7};

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]%2 != 0){
                System.out.println("odd no "+ arr[i]);
            }
        }

    }
}
