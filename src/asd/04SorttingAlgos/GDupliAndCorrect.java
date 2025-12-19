import java.util.*;

public class GDupliAndCorrect {

    public static void main(String[] args) {
        int[] arr = {1,2,3,2,4  };
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

static List<Integer> search(int arr[]){
    List<Integer> dupli = new ArrayList<>();
   for(int i=0;i<arr.length;i++){
        if(arr[i] !=i+1){
            dupli.add(arr[i]);
        }
   }
   for(int i=0;i<arr.length;i++){
        if(arr[i] !=i+1){
            dupli.add(i+1);
        }
   }

return dupli;
}
    
}
