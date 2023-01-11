package new_lab.array;

public class Merge_sum {
    public static void main(String[] args) {
        int arr1[] = {2,3,4,5,7,2,6,8,9,4,7};
        int arr2[] = {2,3,4,5,7,2,6,8,9,4,7};
        int sum[] = new int[11];
        int s = 0;
        for (int i = 0; i < sum.length ; i++) {
            sum[i]= (arr1[i]+arr2[i]);
        }
        for (int ele:sum) {
            System.out.println("sum of arr "+ele);
        }
    }
}
