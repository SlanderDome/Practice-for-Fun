import java.util.*;

public class twodeearrays{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*
 * Two-dimensional arrays in Java are essentially arrays of arrays.
 *       123
 *       456
 *       789
 *  
 */
        int[][] arr = new int[3][]; // 2D array of size 3x3
         //while declaring multideminsional arrays the size of columns is not mandatory
        /* lets see an example
        int[][] arr = {
            {1, 2, 3,56},
            {4, 5},
            {7, 8, 9}
        };
        here you can see that the size of columns is not mandatory
        */


        // input for 2D array
        for(int row=0;row<3;row++){//outer loop is iterating rows
            for(int col=0;col<arr[row].length;col++){//inner loop iterates coloumns for Each row
                arr[row][col]=sc.nextInt();
            }
        }
//       output1 including
//for each loop syntax is 

        for(int[] element: arr){
            System.out.println(Arrays.toString(element));
        }
        
    
      }
}