package new_lab.array;

public class Sum_of_Square {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,7,2,6,8,9,4,7};
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum += (arr[i]*arr[i]);
        }
        System.out.println("Sum of Square of  no : "+sum);
    }
}
