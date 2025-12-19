/*
 * Find the first and last position of an elemnt of a sorted array
 * arrr[1,2,3,4,4,6] target=4
 * op= [4,5]
 */
import java.util.*;
public class EFirstandLast {
    public static void main(String[] args) {
        int nums[]={5,7,7,8,8,10};
        int target=8;
        System.out.println(Arrays.toString(find(nums, target)));
    }

    static int[] find(int []nums,int target){
        int[]arr={-1,-1};
        int last=search(nums, target, false);
        int first =search(nums, target, true);
         arr[0]=first;
         arr[1]=last;
         return arr;


    
    }


    static int search(int[]nums,int target, boolean check){
        int start=0;
        int end=nums.length-1;
       int ans=0;
        while(start<=end){
             int mid= start+(end-start)/2;
            if(target<nums[mid]){
                
                end=mid-1;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else{
                ans=mid;
                if(check){
                    start=mid+1;
                }
                else{
                    end=end-1;
                }
            }
        }
        return ans;
    }
    
}
