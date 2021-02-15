package sumToTheNthParameter;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SumToNthParameterTest {
    @Test
    public void test1() {
        assertEquals("1.57", SumToNthParameter.seriesSum(5));
    }
    @Test
    public void test2() {
        assertEquals("1.77", SumToNthParameter.seriesSum(9));
    }
    @Test
    public void test3() {
        assertEquals("1.94", SumToNthParameter.seriesSum(15));
    }

}