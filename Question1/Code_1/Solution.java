package Code_1;

public class Solution {

    public static long solve(long n){
        long mul=1;
        long sum=0;
        while(n>0){
            long r=n%7;
            sum+=r*mul;
            mul*=10;
            n/=7;
        }
        return sum;
    }
}