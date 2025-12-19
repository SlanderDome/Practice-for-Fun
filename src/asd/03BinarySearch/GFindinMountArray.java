//Find the elemnt in mountain array
//leetcode hard

public class GFindinMountArray {
    public static void main(String[] args) {
        int[] arr = {1,4,6,8,7,3,2};
        int target=3;
        System.out.println(find(arr,target));
        
    }

    static int find(int []arr,int target){

        int peak= Peaksearch(arr);
        int ascendingsearch= binarysearch(arr, target,0, peak);
        int descendingsearch=binarysearch(arr,target,peak+1,arr.length-1);
        if(ascendingsearch!=-1){
            return ascendingsearch;
        }         
        else{
            return descendingsearch;
        }
    }

    static int Peaksearch(int arr[]){
        
        int start=0;
        int end=arr.length-1;
        

        while(start<end){
            int mid=start+(end-start)/2;
            //int ans=mid;
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
        int ans= start;
        return ans;
}

static int binarysearch(int[] arr, int target,int start,int end){

        while(start<=end){
            
            int mid=start+ (end-start)/2;

           

            if(target<arr[mid]){
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
    

