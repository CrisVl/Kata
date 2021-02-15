package likes;

import org.testng.annotations.Test;
import static org.junit.Assert.assertEquals;

public class AndLikesTest {
    @Test
    public void staticTests() {
        assertEquals("no one likes this", AndOthersLikes.whoLikesIt());
        assertEquals("Peter like this", AndOthersLikes.whoLikesIt("Peter"));
        assertEquals("Jacob and Alex like this", AndOthersLikes.whoLikesIt("Jacob", "Alex"));
        assertEquals("Max, John and Mark like this", AndOthersLikes.whoLikesIt("Max", "John", "Mark"));
        assertEquals("Alex, Jacob and 2 others like this", AndOthersLikes.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }
}