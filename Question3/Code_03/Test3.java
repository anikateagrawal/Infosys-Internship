package Code_03;
import static org.junit.Assert.assertEquals;

import org.junit.*;

public class Test3 {
    @Test
    public void test1(){
        assertEquals(2, Solution.solve(6 ,1,6));
    }
    @Test
    public void test2(){
        assertEquals(37, Solution.solve(15,30,100));
    }

    @Test
    public void test3(){
        assertEquals(28326607695L, Solution.solve(235714494,2,100000000000L));
    }
    
}
