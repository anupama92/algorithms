//import java.util.*;
//import java.util.Queue;

/**
 * Created by arao10 on 1/23/18.
 */

public class Main {



    public static void main(String[] args) {
//        Queue array = new Queue();
//
//        array.enqueue(2);
//        array.enqueue(5);
//        array.enqueue(9);
//        array.enqueue(14);
//        System.out.println("dequeue after enqeuing 14: " + array.dequeue()); //prints 2
//        array.enqueue(12);
//        array.enqueue(3);
//        System.out.println("dequeue after enqueing 3: " + array.dequeue()); //prints 5
//        System.out.print("Elements in the queue: [");
//        for (int i = 0; i <= array.size(); i++) {
//            System.out.print(array.dequeue() + ",");
//        }
//        System.out.println("]");
        int[] arr = {8, 2, 3, 6, 4, 5, 1, 7}; int counter =0;
        LomutoQuickSort quickSort1 = new LomutoQuickSort();

        quickSort1.quickSort(arr, 0, arr.length - 1, counter);
        System.out.print("Sorted array:");
        quickSort1.printArr(arr);

    }
}


