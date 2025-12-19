

public class CPerformance {
    public static void main(String[] args) {
        
        String str="";//empty strrnig

        for(int i=0;i<26;i++){
            char ch= (char)('a'+i); 
            str=str+ch;//concatenates the chars into the string
        }
        System.out.println(str);
   
        /*
Characters are Numbers: Internally, Java treats characters like numbers based on their ASCII or Unicode value. For example, the character 'a' has the number 97, 'b' is 98, 'c' is 99, and so on.
The Addition: The code 'a' + i performs a mathematical addition. It takes the numeric value of 'a' (which is 97) and adds the integer i to it.
The Type Cast: The (char) part is a type cast. It takes the resulting number and converts it back into its corresponding character.
Example:
If i is 0: 'a' + 0 is 97 + 0 = 97, which is cast back to the character 'a'.
         */
    }
    
}
