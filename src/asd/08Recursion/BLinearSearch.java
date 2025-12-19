import java.util.ArrayList;

class BLinearSearch{
//find eleemnt in arr using recusrion
    public static void main(String[] args) {
        int arr[]={1,2,5,6,88,9};
        System.out.println(finde(arr,5,0));
        multiple(arr,7,0);
        System.out.println(list);
    }
    static int finde(int arr[],int target,int index){
        int end=arr.length-1;
        if(arr[index]==target){
            return index;
        }
        if(arr[index]==arr[end]&&arr[end]!=target){
            return -1;
        }
        
        return finde(arr,target,index+1);
    }
static ArrayList<Integer> list= new ArrayList<>();
    //if multiple element then use arraylist
    static void multiple(int arr[],int target,int index){
       int end=arr.length-1;
        if(arr[index]==target){
            list.add(index);
        }
        if(arr[index]==arr[end]&&arr[end]!=target){
          
          return;
        }
         multiple(arr, target, index+1);
    }
}