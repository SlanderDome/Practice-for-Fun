public class EvenNoOfDigits {

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
        
    }
    

    //if numbers are even iterate the count  of them
    static int findNumbers(int[] nums){
        int count=0;
        for(int each:nums){
            if(even(each)){
                count++;
            }
        }
        return count;
    }


    //function to check if the number is even digit 
    static boolean even(int num){
        if(countt(num)%2==0){
            return true;
        }
        else{
            return false;
        }
    } 
    

    //function to count the digits
    static int countt(int num){
        int digit=0;
        while(num>0){
            num=num/10;
            digit++;
        }
        return digit;

    }
}
