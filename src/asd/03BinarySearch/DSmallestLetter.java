
//Return the smallest character in array that is larger than array
//Basicall ceilingof a eleemtn


public class DSmallestLetter {
    public static void main(String[] args) {
        char[] arr={'c','f','g','l','m','s','t'};
        char target='z';
        System.out.println(ceiling(arr, target));
    }

    static char ceiling(char arr[],char target){

        int start=0;
        int end=arr.length-1;
       
        while(start<=end){
             int mid= start+(end-start)/2;
            if(target<arr[mid]){
                
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }

        return arr[start%arr.length];
    }

}
