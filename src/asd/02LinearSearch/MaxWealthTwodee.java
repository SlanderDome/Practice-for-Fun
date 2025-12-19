/*calculate the wealth.
i.e the{
    account=c0l
    person=row
    [6,6,7]bank acc of person 1 toatal wealth=6+6+7
    [1,2,3]bank acc of person 2 toatal wealth=1+2+3
    return maxx weALTH i.e 19
}
*/

public class MaxWealthTwodee {
    public static void main(String[] args) {

        int[][] bank={
            {1,2,3,4},
            {18,6,2},
            {9,10},
            {34,7,88,34,17}
        };

        System.out.println(wealth(bank));
        
        
    }

    static int wealth(int[][]bank){
        int ans=Integer.MIN_VALUE;
        for(int person=0;person<bank.length;person++){
            int sum=0;
            for(int acc=0;acc<bank[person].length;acc++){
                sum=sum+bank[person][acc];
                }
                if(sum>ans){
                    ans=sum;
                    }
                }
                return ans;
    }
}
/*
 ans is initialized to Integer.MIN_VALUE so that any sum will be larger than it initially.

Outer loop → goes through each person in bank.

sum → stores the total money for the current person.

Inner loop → goes through each acc (account) of that person and adds the amounts.

After inner loop → compares sum with ans, and updates ans if this person’s wealth is greater.

Finally returns ans.
 */
