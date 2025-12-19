

public class linsrch {
    //timpe complexity: O(n)
    //best case: O(1)
    //worst case: O(n)
   public static void main(String[] args) {
    int arr[]={12,78,9,5};
    int target=9;
    int ans= search(arr,target);
    System.out.println(ans);
   }
   //linear search 
    static int search(int arr[], int target){

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return arr[i];
            }
        }
        return 0;
    }

    
}
