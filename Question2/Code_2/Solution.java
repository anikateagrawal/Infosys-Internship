package Code_2;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int courses[][]=new int[n][2];
        for(int i=0;i<n;i++){
            courses[i][0]=sc.nextInt();
            courses[i][1]=sc.nextInt();
        }
        int order[]=solve(courses);
        for(int i=0;i<n;i++){
            System.out.print(order[i]+" ");
        }
    }
    public static int[] solve(int courses[][]){
        PriorityQueue<List<Integer>> q=new PriorityQueue<List<Integer>>((a,b)->
            (int)a.get(1)!=(int)b.get(1) ? a.get(1)-b.get(1) : a.get(0)-b.get(0));
        PriorityQueue<List<Integer>> q2=new PriorityQueue<List<Integer>>((a,b)->
            courses[a.get(0)][0]!=courses[b.get(0)][0] ? courses[a.get(0)][0]-courses[b.get(0)][0]:a.get(1)-b.get(1));
        int n=courses.length;
        int order[]=new int[n];
        int o=0;
        for(int i=0;i<n;i++){
            List<Integer> l=new ArrayList<>();
            l.add(i);l.add(courses[i][1]);
            q2.add(l);
        }
        int start=0;
        while(!q2.isEmpty()){
            if(!q.isEmpty()){
                List<Integer> t=q.poll();
                order[o++]=t.get(0);
                start=start+t.get(1);
            }
            else {
                List<Integer> next=q2.poll();
                start=courses[next.get(0)][0];
                q.add(next);
            }
            while(!q2.isEmpty()&&courses[q2.peek().get(0)][0]<=start){
                q.add(q2.poll());
            }
        }
        while(!q.isEmpty()){
            List<Integer> t=q.poll();
            order[o++]=t.get(0);
        }
        return order;
    }
}