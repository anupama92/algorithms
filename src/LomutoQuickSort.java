/**
 * Created by arao10 on 2/7/18.
 */
public class LomutoQuickSort {

    public void printArr(int[] arr) {
        int i;
        for (i = 0; i < arr.length; i++) {
            System.out.print("\t" + arr[i]);
        }
        System.out.println();
    }

    public void quickSort(int[] arr, int left, int right, int k, int counter) {

        System.out.println("\nQuickSort Loop # " + counter);
        counter++;

        System.out.print("Values BEFORE partition:");
        printArr(arr);
        int val = lomuto(arr, left, right);

        System.out.print("Values AFTER partition:");
        printArr(arr);

        if (val == k - 1) {

            return;
        } else {

            if (val > (k - 1)) {
                quickSort(arr, left, val - 1, k, counter);

            } else {
                quickSort(arr, val + 1, right, k, counter);
            }
        }

    }

    private int lomuto(int[] arr, int left, int right) {

        int pivot = arr[left];
        int j = left;
        int i;

        System.out.println("\tLomuto algorithm: ");
        for (i = left + 1; i <= right; i++) {
            if (arr[i] < pivot) {
                System.out.print("\t\tBEFORE swaping:");
                printArr(arr);
                j++;
                System.out.println("\t\t***Swap arr[j]:" + arr[j] + " with arr[i]:" + arr[i] + " as arr[i]:" + arr[i] + " is less than pivot:" + pivot);
                swap(arr, j, i);
                System.out.print("\t\tAFTER swaping:");
                printArr(arr);
                System.out.println();
            }
        }
        System.out.println("\t\tFinal swap between arr[left]:" + arr[left] + " and arr[j]:" + arr[j] + " before returning j:" + j);
        swap(arr, left, j);

        return j;
    }

    private void swap(int[] arr, int i, int j) {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
