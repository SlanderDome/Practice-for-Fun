

public class CPattern {
    public static void main(String[] args) {
        int n=1;
        int t=5;
        for (int i=0;i<5;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
                
            }
           
            System.out.println("");
            n++;
        }
        System.out.println();
        for (int i=0;i<5;i++){
            for(int j=0;j<t;j++){
                System.out.print("*");
                
            }
           
            System.out.println("");
            t--;
        }
    }
}
