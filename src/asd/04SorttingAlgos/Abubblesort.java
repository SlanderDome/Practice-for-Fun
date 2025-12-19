/*
 📖 Bubble Sort Theory

Idea: Repeatedly compare adjacent elements and swap them if they are in the wrong order.

After each full pass, the largest element "bubbles up" to the end.

Keep repeating until the array is sorted.

🔑 Key Points:

Best case (already sorted) → O(n).

Worst case (reverse sorted) → O(n²).

Stable sorting → maintains order of equal elements.

In-place sorting → requires no extra memory.
 */
//it is stable sorting algorithm
/*
 * A sorting algorithm is called stable if it preserves the relative order of equal elements after sorting.

👉 That means: if two elements have the same value, they will appear in the same order in the sorted array as they appeared in the original array.
 */
import java.util.*;

//import java.lang.reflect.Array;

public class Abubblesort { 
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubblesort(int arr[]){
        int end=arr.length-1;
        boolean swap;

        for(int i= 0;i<end;i++){
            swap=false;
            for(int j=0;j<end-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=true;
                }
            }
            if(!swap){
               break;
            }
        }
    }
}
    
