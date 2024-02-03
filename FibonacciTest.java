import org.junit.*;

public class FibonacciTest {
    @Test
    public void test(){
        Fibonacci calculate = new Fibonacci();
        Assert.assertEquals(55, calculate.fibonacciSequence(10));
    }
}
