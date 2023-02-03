package Code_1;
import java.util.*;;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        System.out.println(solve(n));
    }
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