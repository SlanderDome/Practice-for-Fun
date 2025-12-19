import java.util.*;

public class FDuplicatevalues {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2,4,3};
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));
         System.out.println("Duplicate: "+search(arr));
    }

    static void cyclicsort(int arr[]){
        int i=0;
        while(i <arr.length){
            int correct=arr[i]-1;
            if(arr[i] !=arr[correct] && arr[i]<arr.length){
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
//when multiple Duplicate values
static List<Integer> search(int arr[]){
    List<Integer> missing = new ArrayList<>();
   for(int i=0;i<arr.length;i++){
        if(arr[i] !=i+1){
            missing.add(arr[i]);
            
        }
   }
return missing;
}

}





