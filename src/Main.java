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

        //Lomuto Quick Sort
        int[] arr = {8, 2, 3, 6, 4, 5, 1, 7}; int counter =0;
        LomutoQuickSort quickSort1 = new LomutoQuickSort();

        quickSort1.quickSort(arr, 0, arr.length - 1, 4, counter);
        System.out.print("\nSorted array:");
        quickSort1.printArr(arr);

//        Fibonacci fibonacci = new Fibonacci();
//        int n = fibonacci.fibonacci(2);
//        System.out.println(fibonacci.fibonacci(2));

//        StringManipulation stringManipulation = new StringManipulation();
//
//        char[] str1 = {'Y', 'E', 'L', 'O', 'W'}; char[] strr2 = {'L', 'O', 'W'};
//
//        int n = stringManipulation.getMatchingSubstring(str1, strr2);
//        System.out.println(n);

    }

//    private static void increment(int i) {
//
//        i++;
//    }
}


