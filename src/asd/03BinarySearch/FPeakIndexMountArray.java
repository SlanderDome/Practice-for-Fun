/*
A mountain array is an array that:

First strictly increases (goes up)

Then strictly decreases (goes down)

Example:

[1, 3, 5, 7, 6, 4, 2]

So the problem asks us:
👉 “Find the index of the peak element in a mountain array.”
 */

public class FPeakIndexMountArray {
    
    public static void main(String[] args) {
        int[] arr = {1,4,6,8,7,3,2};
        System.out.println(search(arr));
        
    }

    static int search(int arr[]){
        
        int start=0;
        int end=arr.length-1;

        while(start<end){
            int mid=start+(end-start)/2;

            if(arr[mid] >arr[mid+1]){
                //thjis means we r in the decreaasing part odf the array
                end=mid;
            }
            else if(arr[mid]<arr[mid +1]){
                //else we r in the ascending part of the mountain
                start=mid+1;
            }
            else{
                start=mid;
            }

        }
        int ans= arr[start];
        return ans;
}

}