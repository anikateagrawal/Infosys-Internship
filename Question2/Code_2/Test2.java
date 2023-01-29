package Code_2;
import static org.junit.Assert.assertArrayEquals;

import org.junit.*;
public class Test2 {
    @Test
    public void test1(){
        assertArrayEquals(new int[]{0,2,3,1}, Solution.solve(new int[][]{{1,2}, {2,4}, {3,2}, {4,1}}));
    }
    @Test
    public void test2(){
        assertArrayEquals(new int[]{4,3,2,0,1}, Solution.solve(new int[][]{{7,10}, {7,12}, {7,5}, {7,4}, {7,2}}));
    }

    @Test
    public void test3(){
        assertArrayEquals(new int[]{0,1}, Solution.solve(new int[][]{{100,100}, {1000000000,1000000000}}));
    }
    
}
