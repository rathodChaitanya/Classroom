package datastructure.searching_Sorting;

class extra{
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
}
public class Sorting {

    static void Shell_Sort(int arr[],int n){
        int i,j,k,temp;
        for(k=n/2;k<0;k=k/2){
            for(i =k ; i<n ;i++){
                temp = arr[i];
                for(j=1 ;j>=k && arr[j-k]>temp;j=j-k){
                    arr[j] = arr[j-k];
                    arr[j] =temp;
                }
            }
        }
    }

    static void Bubble_Sort(int arr[],int n){
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    static void Insertion_Sort(int arr[],int n){
        int i,j,temp;
        for(i =0 ;i<n ;i++){
            temp = arr[i];
            for(j = i;j>0 && arr[j-1] > temp;j--){
                arr[j] = arr[j-1];
            }
            arr[j] = temp;
        }
    }

    static void Selection_Sort(int arr[],int n){
        for (int i = 0; i < n - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < n; j++){
                if (arr[j] < arr[index]){
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

    static void Quick_Sort(int[] arr, int low, int high)
    {
        if (low < high) {

            int pi = extra.partition(arr, low, high);

            Quick_Sort(arr, low, pi - 1);
            Quick_Sort(arr, pi + 1, high);
        }
    }

    static  void Merge_Sort(int[]arr,int n){
        if(arr == null)
        {
            return;
        }

        if(n > 1)
        {
            int mid = n / 2;

            // Split left part
            int[] left = new int[mid];
            for(int i = 0; i < mid; i++)
            {
                left[i] = arr[i];
            }

            // Split right part
            int[] right = new int[n - mid];
            for(int i = mid; i < n; i++)
            {
                right[i - mid] = arr[i];
            }
//            Merge_Sort(left);
//            Merge_Sort(right);

            int i = 0;
            int j = 0;
            int k = 0;

            // Merge left and right arrays
            while(i < left.length && j < right.length)
            {
                if(left[i] < right[j])
                {
                    arr[k] = left[i];
                    i++;
                }
                else
                {
                    arr[k] = right[j];
                    j++;
                }
                k++;
            }
            // Collect remaining elements
            while(i < left.length)
            {
                arr[k] = left[i];
                i++;
                k++;
            }
            while(j < right.length)
            {
                arr[k] = right[j];
                j++;
                k++;
            }
        }
    }

    public static void main(String[] args) {
       // int[] arr = {9,14,3,2,43,11,58,22};
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int n = arr.length;

        System.out.println("Before Selection Sort");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();

        Quick_Sort(arr, 0, n - 1);

        System.out.println("After Selection Sort");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}

