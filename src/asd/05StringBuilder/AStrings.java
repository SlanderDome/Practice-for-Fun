/*
 Strings are stored in string pool, which is located inside heap memeory
 string pool is a seperate memory structure inside the heap
 it is so because to not create any duplicate value
 if 2 strings have same value they point to the same stringpoool

 S in String is always capital becuase its an inbulit class of java
 */

 /*
  *to compare the strings use '=='(comparator). ifit give true thent they are same elsse not
  String a='abc'
  String b='abc'
  a==b? ans: true   
  if we want same value in the heap to behave as explicitly differenvt obbetcts, ie if we use == it would give false..
  ...we will use new keyword

  String a= new String("Abc");
  String b= new String("Abc");
  a==b? ans: false
  This time it woont be stored in stringpool, but outside of it in the heap memory

  */


public class AStrings {
    public static void main(String[] args) {

        String a = "abc";
        String b = "abc";
        System.out.println(a==b);

        String c= new String("Abc");
        String d= new String("Abc");
        System.out.println(c.equals(d));//false

        //to print a particu;ar index of string we use charAt
        String s="ABCD";
        System.out.println(s.charAt(0));//it iwll give A
        
        
        
        
        /*
         The System.out.printf() method in Java is used for formatted printing. 
         It allows you to create a string with special placeholders (called format specifiers) that get replaced by variables you provide.
        A format specifier always starts with a % sign. In your code, the specifier is %.2f.
        %: Marks the beginning of a format specifier.
        .2: Specifies the precision, meaning it should be rounded to 2 decimal places.
        f: Indicates that the variable to be printed is a floating-point number (like a float or double).
         */
        float l=10.2345f    ;
        System.out.printf("Formatted noumber: %.2f",l);

    }
    
}
