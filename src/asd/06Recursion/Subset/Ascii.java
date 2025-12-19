//package asd.06Recursion.Subset;

public class Ascii {
    public static void main(String[] args) {
       subset("", "ABC");
        
    }

    static void subset(String check,String str){
        if(str.isEmpty()){
            System.out.println(check);
            return;
        }

        char c= str.charAt(0);
        subset(check+c, str.substring(1));
        subset(check,str.substring(1));
        subset(check+(c+0),str.substring(1));
    }
}
