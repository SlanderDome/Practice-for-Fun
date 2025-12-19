

public class MinMaxNum {
    public static void main(String[] args) {
        int[] arr={55,24,3,-1,5};
        int ans= min(arr);
        System.out.println("Miniimum number is "+ans);
        System.out.println("max number is :"+max(arr));
      
    }

    static int min(int arr[]){

        int count=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<count){
                count=arr[i];
            }        
        }
         return count;}



     static int max(int arr[]){

        int count=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>count){
                count=arr[i];
            }        
        }
         return count;}
    
    
}
