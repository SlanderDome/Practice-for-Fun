

public class AFindIfArrayIsSorted {
    
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5,6,66,7};
        System.out.println(check(arr));
        System.out.println(Find(arr,0));
    }

    static boolean check(int arr[]){
        int end=arr.length-1;
        return helper(arr,0,end);
    }
    static boolean helper(int arr[],int a,int c){
        
        if(c<=1){
            return true;
        }
        if(arr[a]<arr[a+1]){
            a=a+1;
        }
        if(arr[a]==c){
            return true;
        }
        if(arr[a]>arr[a+1]){
            return false;
        }
        
        return helper(arr, a,c);
        
    }

    //or

    static boolean Find(int arr[],int index){
        int c=arr.length-1;
        if(arr[index]==c){
            return true;
        }

        return arr[index]>arr[index+1] && Find(arr,index+1);

    }
}
