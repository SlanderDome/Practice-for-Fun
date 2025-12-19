import java.util.Arrays;
public class swap {

     static void swap(int[] arr, int index1,int index2){

        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;

     }

    public static void main(String[] args) {

        int arr[]={1,2,4,5,6};
        System.out.println("Before swapping: ");
        System.out.println(Arrays.toString(arr));

        swap(arr,2,4);
        System.out.println("After swapping: ");
        System.out.println(Arrays.toString(arr));
        
    }
    
}
