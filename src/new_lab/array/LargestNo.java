package new_lab.array;

public class LargestNo {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,7,2,6,8,9,4,7};
        int temp;
        for (int i = 0 ; i < arr.length; i++)
        {
            for (int j = 0 ; j < arr.length - i - 1; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Largest No : "+arr[arr.length-1]);
    }
}
