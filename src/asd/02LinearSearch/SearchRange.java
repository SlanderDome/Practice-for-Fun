public class SearchRange{


    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int target=8;
        //we want to serach in range supppose index[2]-index[4]
        int start=2;//because we have to start searching from index 2
        int end=4;//because we have to start searc till index 4
        int ans=search(arr, target, start, end);
        System.out.println(ans);
    }

    static int search(int arr[],int target,int start,int end){
        
        for(int i=start;i<end;i++){
         
            if(arr[i]==target){
                return i;
            }
 
        }

       return -1;
    }

}