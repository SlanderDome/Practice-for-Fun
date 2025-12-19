/*

floor of a no =the largest element in the array that is smaller than or equal to the target.

It’s the opposite of ceiling (which was the smallest element ≥ target).
Array = {1, 2, 4, 6, 10, 17}

Target = 7

Floor = 6 (largest number ≤ 7)

Ceiling = 10

Target = 10
 
Floor = 10 (exact match allowed)

Ceiling = 10
 */




public class CFloorofaNo{
 public static void main(String[] args) {
         int [] arr={1,2,4,5,6,10,17};
         int target=11;
         System.out.println(search(arr, target));
    }

    static int search(int arr[],int target){

        int start=0;
        int end=arr.length-1;

        while(start<=end){

             int mid= start+(end-start)/2;
        if(target==mid){
            return mid;
        }
        else if(target>arr[mid]){
            start=1+mid;
            
        }
        else{
            end=mid-1;
        }
        }
       

        return arr[end];


    }
}