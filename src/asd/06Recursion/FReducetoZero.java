
//reduce tghe n0umber to zero, by divididing it by 2 if even else subtract 1 if odd. print the tital no of steps it takes to be 0
public class FReducetoZero {
    public static void main(String[] args) {
        int n=8;
        System.out.println(countt(n));
    }
    static int countt(int n){
        return helper(n,0);
    }

    static int helper(int n,int count){
        if(n==0){
            return count;
        }
        if(n%2==0){
            n=n/2;
            count=count+1;
        }
        else {
            n=n-1;
            count=count +1;
        }
        return helper(n,count);

    }
}
