public class BFibonnaciSeries {
    public static void main(String[] args) {
        int n = 10;
        int l=fibo(n);
        System.out.println(l);
    }

    static int fibo(int n) {
        
        if(n<2){
            return n;
        }
       int ans=(n-1)+(n-2);
           return ans;
    }
}
