package sortOddArray;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SortOddArrayTest {
    @Test
    public void exampleTest1() {
        assertArrayEquals(new int[]{ 1,3,2,8,5,4 }, SortOddArray.sortArray(new int[] { 5,3,2,8,1,4 }));
    }
}