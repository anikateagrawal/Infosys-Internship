package Code_03;

import java.util.*;

public class Solution {

    public static long solve(int a,long l,long r){
        Set<Long> pa=new HashSet();
        prime(a,pa);
        List<List<Long>> a1=new ArrayList();
        for(int i=0;i<=pa.size();i++)a1.add(new ArrayList());
        fun(new ArrayList(pa),0,a1,1,0);
        a1.remove(0);
        long c1=coprime(a1,l,r);
        return c1;
    }

    static void fun(List<Long> s,int in,List<List<Long>> ans,long p,int c){
        if(in==s.size()){
            ans.get(c).add(p);
            return;
        }
        fun(s,in+1,ans,p*s.get(in),c+1);
        fun(s,in+1,ans,p,c);
    }
    static long coprime(List<List<Long>> cc,long l,long r){
        long ans=r-l+1;
        int sn=-1;
        for(List<Long> c:cc){
            for(long i:c){
                long fm=l;
                if(l%i!=0)fm+=i-l%i;
                long lm=r;
                if(r%i!=0)lm-=r%i;
                if((lm-fm)/i+1>0)
                    ans+=sn*((lm-fm)/i+1);
            }
            sn*=-1;
        }
        return ans;
    }
    static void prime(int n,Set<Long> s){
        if (n>0)
        {
            while (n%2==0)
            {
                s.add(2L);
                n /= 2;
            }
            for (int i = 3; i <= Math.sqrt(n); i+= 2)
            {
                while (n%i == 0)
                {
                    s.add((long)i);
                    n /= i;
                }
            }
            if (n > 2)s.add((long)n);
        }
    }
}