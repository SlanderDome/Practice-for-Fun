import java.util.*;

public class MaxItem {
    static int max (int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        int[]arr= new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(("Max ="+ max(arr)));

    }
}
