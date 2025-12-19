//Recursion is a function that callss itself

public class ARecursion {
    //suppose we have to print 3 nos
    public static void main(String[] args) {
        print(1);
        
    }
    /*
     //WITHOUT RECURSION WE SEE THAT WE ARE CALLING MANY FUNCTIOINS WHO HAVE THE SAME BODY
     THIS WOULD CREATE A LOT OF MEMORY IN THE STACK
    BUT WHAT IF WE NEEDED TILL NUMBER 1000, WE CANT CREATE EVRRY NEW FUNCTIONS
    static void print1(int n){
        System.out.println(n);
        print2(2)//calling function 2 to print 2
    }
    static void print2(int n){
        System.out.println(n);
        print3(3);//calling function 3 to print 3
    }
    static void print3(int n){
        System.out.println(n);
    }
      */

      static void print(int n){
        if(n==4){//base condition, where our recursion will stop making recursuve calls
            return;//when n=4 it would  exit and print till 3
        }
        System.out.println(n);
        print(n+1);//we are calling the function itself
        //here we are not creating multiple functions
      }
}


