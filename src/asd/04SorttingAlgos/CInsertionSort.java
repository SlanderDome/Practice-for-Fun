/*
 *Time Complexity

Best case (already sorted): O(n)

Worst case (reverse sorted): O(n²)

Stable: ✅ Yes (keeps equal elements in original order).
In-place: ✅ Yes (doesn’t need extra memory).
Start from the second element (because the first element alone is always “sorted”).
Compare the current element with the elements in the sorted part (left side).
Shift elements one position to the right until the correct position for the current element is found.

Insert the current element at that position.

Repeat for all elements.
runs for n-2 index
no. of swaps reduced as compared to bubble sort
good when array is partially sorted 
 */
import java.util.*;

public class CInsertionSort{
    public static void main(String[] args){
int[] arr = {5, 4, 3, 2, 1};
        Insertion(arr);
        
        System.out.println(Arrays.toString(arr));
    }

    static void Insertion(int arr[]){

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr, j, j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    static void swap(int arr[],int first,int second){
        int temp= arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}