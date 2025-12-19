// subset is non continuous but maintains the order
//eg str=abc
//subdet= a,b,c,ab,bc,abc(it maintains the order)
//use recursion. basicallly take the eleemnt or dont take it . refer IMG A

public class A {
    public static void main(String[] args) {
        
        subset(" ", "ABC");
    }

    static void subset(String check,String str){

        if(str.isEmpty()){
            System.out.print(check);
            return ;
        }

        char c=str.charAt(0);
        subset(check+c,str.substring(1));
        subset(check,str.substring(1));
    }
    
}
/*
 
 * Let’s trace it for subset("", "ABC")
Step 1:
check = "", str = "ABC"
c = 'A'

It makes two recursive calls:
subset("A", "BC") → take 'A'
subset("", "BC") → skip 'A'

Step 2 (Left branch of first call):
subset("A", "BC")

c = 'B'
Again two calls:

subset("AB", "C") → take 'B'
subset("A", "C") → skip 'B'

Step 3 (Deeper left):
subset("AB", "C")

c = 'C'
→ calls:

subset("ABC", "") ✅ base case → prints "ABC
subset("AB", "") ✅ base case → prints "AB"

Step 4 (Back to subset("A", "C")):

c = 'C'
→ calls:

subset("AC", "") ✅ prints "AC"
subset("A", "") ✅ prints "A"
 */