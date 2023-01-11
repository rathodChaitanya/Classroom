package new_lab.array;
//Write a Program to find the sum of any ten numbers
public class Sum {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,7,2,6,8,9,4,7};
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
           sum += arr[i];
        }
        System.out.println("Sum of no : "+sum);
    }
}
