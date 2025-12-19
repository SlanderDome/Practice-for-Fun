//BINARY SEARCH WORKS WITH SORTED ARRAYS ONLY
/*

1 Find the middle element
2 Check if the target variable lies on to the left side or on the right side of the middle element
3 There will be a S start variable and E end variable. S+E/2= M middle variable
4 Suppose the target variable is in the right side of M
5 The right side will bwehave as a new array. With its first element as S and last element as E
6 Repeat the above steps until the desired element is found
7 NOTE also check if T==M then return the middle element
 */

public class Abinarysearch {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};
        int target=6;
        System.out.println(search(arr,target));
        
    }


    static int search(int[] arr, int target){

        //first calc the middle
        //initialize our start and end pointer
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            //int mid=(start+end)/2________This might not be possible when the numbers are too large as it may exceed the int size
            int mid=start+ (end-start)/2;

            //NOw calc all the 3 cases

            if(target<arr[mid]){
                //this will be on the left side soo the Start element will be same
                 end= mid -1;
            }
            else if(target > arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }


        return -1;
    }

}
