import java.util.*;
public class array {
    

    public static void main(String[] args) {
       //array ka syntax= datattype[] arrayname= new datatype[sizeofarr]
       //eg int[] arr= new int [5];
      Scanner sc= new Scanner (System.in);
       //array ka size fix hota hai
       //array ka index 0 se start hota hai
       //array ka last index size-1 hota hai
       //array objects are in heap memory
       //heap objects are not contiguous
       //it has dynamic memory allocation. hence array objects in java internally may not be contiguous.
        //new keyword is used to create an array object in java.
         int[] arr = new int[5]; //array of size 5
        //int[] arr = {1, 2, 3, 4, 5}; //array of size 5 with initial values
        System.out.println(arr[1]);
        //null is a default value for all the elements in an array of objects
        
        //to take input of array
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        //to display array
        // for(int i=0; i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }

        //to display array using for each loop
        for(int element: arr){
            System.out.print(element+" ");//here element is a copy of the value in the array
        }
        
        //strings are immutable in java
        //array is mutable in java
        //mutable means we can change the value of the elements in the array
        //immutable means we cannot change the value of the elements in the string
        //ArraytoString is used to convert an array to a string
        System.out.println(Arrays.toString(arr));
       }
    }

