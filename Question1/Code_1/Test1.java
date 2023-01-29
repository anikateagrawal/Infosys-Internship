package Code_1;
import static org.junit.Assert.assertEquals;

import org.junit.*;

public class Test1 {
    @Test
    public void test1(){
        assertEquals(6, Solution.solve(6));
    }
    @Test
    public void test2(){
        assertEquals(13, Solution.solve(10));
    }

    @Test
    public void test3(){
        assertEquals(104134235534L, Solution.solve(2147489999L));
    }
    
}
