package new_lab.methods;

public class Merge {

    public static void sum(int arr1[],int arr2[],int sum[]){
        int s = 0;
        for (int i = 0; i < sum.length ; i++) {
            sum[i]= (arr1[i]+arr2[i]);
        }
        for (int ele:sum) {
            System.out.println("sum of arr "+ele);
        }
    }

    public static void main(String[] args) {
        int arr1[] = {2, 3, 4, 5, 7, 2, 6, 8, 9, 4, 7};
        int arr2[] = {2, 3, 4, 5, 7, 2, 6, 8, 9, 4, 7};
        int sum[] = new int[11];
        sum(arr1,arr2,sum);
    }
}
