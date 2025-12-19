import java.util.Arrays;

public class EMissingValueinContiSort {
   

    public static void main(String[] args) {
        int arr[]={5,0,1,3,4};
        
        sort(arr);
        System.out.println(Arrays.toString(arr));
         //System.out.println(search(Arrays.toString(arr)));
         System.out.println("Missing "+search(arr));
          
}
static void sort(int arr[]){
int i=0;
while(i<arr.length){
    int correctIndex=arr[i];
    if(arr[i] < arr.length && arr[i] != arr[correctIndex]){
        swap(arr,i,correctIndex);
    }
    else{
        i++;
    }
}
}

static int search(int arr[]){
    
   for(int i=0;i<arr.length;i++){
        if(arr[i] !=i){
            return i;
        }
   }
  return arr.length;
}

static void swap(int arr[],int first,int sec){
    int temp=arr[first];
    arr[first]=arr[sec];
    arr[sec]=temp;

}

}
