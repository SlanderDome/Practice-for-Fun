/*
 
when in questionn given array is from 1-N
then cyclic sort applicabele

Cyclic Sort is a sorting algorithm that works best when:

The array contains numbers in the range 1 to N (or 0 to N-1).

Each number appears exactly once (no duplicates).

👉 Instead of comparing every element like bubble or insertion sort, it puts each number directly in its correct position.

🔹 Idea Behind Cyclic Sort

If numbers are from 1 to N, then the number x should be at index x-1.

If numbers are from 0 to N-1, then the number x should be at index x.

Keep swapping until every element is in its right position.
 */

import java.util.*;
public class DCyclicSOrt {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicsort(int arr[]){
        int i=0;
        while(i <arr.length){
            int correct=arr[i]-1;
            if(arr[i] !=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }

        }
    }

    static void swap(int arr[],int first,int second){
        int temp= arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    
}
