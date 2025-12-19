/*
 * the question want sus to find the ceilig of  ano
 * ceiling of a no= smallest element in the array that is greater or equal to the target
 * arr[1,2,4,5,6,7]
 * target=2
 * then COA=2
 * target=3, then COA=4
 */

public class BCeilingofaNo {
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
       

        return arr[start];


    }
}
