import java.util.Arrays;

public class TwoDEEarraySearch {

    public static void main(String[] args) {
        

        int[][] arr={
            {1,2,3,4},
            {18,6,2},
            {9,10},
            {34,7,88,34,17}
        };

        int target=100;
        int []ans= search(arr, target);
        System.out.println(Arrays.toString(ans));
    }


    static int[] search(int [][] arr, int target){

        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
                
            }
        }

        return new int []{-1,-1};

    }
    
}
