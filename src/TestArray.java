/**
 * Created by arao10 on 2/7/18.
 */
public class TestArray {

    public static  void printArr(int[] arr) {
        int i;
        for(i=0; i<arr.length; i++){
            System.out.println("Elements in array: "+arr[i]);
        }
    }

    public static void arrSwap(int[] arr){
        int i;
        for(i=0; i<arr.length; i++){
            arr[i] = 0;
        }
    }
}
