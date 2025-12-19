/*
 Selection Sort is a simple comparison-based sorting algorithm.
The idea:

Find the minimum element in the unsorted part.

Swap it with the first element of the unsorted part.

Repeat for the rest of the array.

Characteristics

Time Complexity:

Best, Worst, Average → O(n²)

Space Complexity: O(1) (in-place sorting).

Stable? ❌ No, because it may swap equal elements.

Better than Bubble Sort?

Fewer swaps (only n swaps max).

But still O(n²) comparisons.
 */

import java.util.Arrays;

public class BSelectionSort {
    
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int arr[]){
        for(int i=0;i<arr.length;i++){
        int last=arr.length-1-i;
        int max=max(arr,0,last);
        swap(arr,max, last);

        }
    }

    static int max(int arr[],int start,int end){
        int maxx=start;
        for(int i=start;i<=end;i++){
            if(arr[maxx]<   arr[i]){
                maxx=i;
            }
        }
        return maxx;
    }


    static void swap(int arr[],int first,int second){
        int temp= arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
