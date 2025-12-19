

public class DPalindromQues {
    public static void main(String[] args) {
        
        String str="abcba";
       boolean ans= PalinCheck(str);
       if(ans==true){
        System.out.println(ans+" Its an palindrome");
       }
       else{
        System.out.println(ans+" Its not a palindrome");
       }
    }

    static boolean PalinCheck(String str){
            if(str==null || str.length()==0){
                return true;
            }
        for(int i=0;i<(str.length()/2);i++){
            char start=str.charAt(i);
            char end= str.charAt(str.length()-1-i);
            if(start!=end){
                return false;
            }
        }
        return true;
    }
    
}
