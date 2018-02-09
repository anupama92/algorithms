/**
 * Created by arao10 on 2/7/18.
 */
public class LomutoQuickSort {

    public void printArr(int[] arr) {
        int i;
        for(i=0; i<arr.length; i++){
            System.out.print("\t"+arr[i]);
        }
        System.out.println();
    }

    public void quickSort(int[] arr, int low, int high, int counter){

        counter++;
        if(low<high){
                 /* pi is partitioning index, arr[p] is now at right place */
            System.out.println("QuickSort Loop # "+counter);
            System.out.print("Values BEFORE partition:");
            printArr(arr);
            int val = lomuto(arr, low, high);
            System.out.print("Values AFTER partition:");
            printArr(arr);
            System.out.println();
            // Separately sort elements before
            // partition and after partition
            quickSort(arr, low, val - 1, counter);
            quickSort(arr, val + 1, high, counter);
        }
    }

    private int lomuto(int[] arr, int low, int high) {

        int pivot = arr[high];    // pivot
        int i = (low - 1);  // Index of smaller element
        int j;
        System.out.println("\tLomuto algorithm: ");
        for (j = low; j <= high- 1; j++)
        {
            // equal to pivot
            if (arr[j] <= pivot)
            {
                System.out.print("\t\tValues in array BEFORE swaping:"); printArr(arr);
                System.out.println("\t\tSwap "+arr[i+1]+" with "+arr[j]+" as arr["+j+"] i.e. "+arr[j]+" is less than pivot "+pivot);
                i++;    // increment index of smaller element
                swap(arr, i, j);
                System.out.print("\t\tValues in array AFTER swaping:"); printArr(arr);
            }
            System.out.println("\t\tDo nothing and continue with the loop as arr["+j+"] i.e. "+arr[j]+" is more than pivot "+pivot);
        }
        System.out.println("\t\tFinal swap between arr[i+1] "+arr[i+1]+" and pivot "+pivot+" before returning (i+1).");
        swap(arr, i + 1, high);
        int val = i+1;

        return val;
    }

    private void swap(int[] arr, int i, int j){
        int temp;
        temp=arr[i];
        arr[i] = arr[j];
        arr[j]=temp;
    }
}
