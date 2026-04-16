import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJUnit {
    @Test
    public void testCount8() {
        assertEquals(1, TestingRecursions.count8(8));
        assertEquals(2, TestingRecursions.count8(818));
        assertEquals(4, TestingRecursions.count8(8818));
    }

    @Test
    public void testCountHi() {
        assertEquals(1, TestingRecursions.countHi("xxhixx"));
        assertEquals(2, TestingRecursions.countHi("xhixhix"));
        assertEquals(1, TestingRecursions.countHi("hi"));
    }

    @Test
    public void testCountHi2() {
        assertEquals(1, TestingRecursions.countHi2("ahixhi"));
        assertEquals(2, TestingRecursions.countHi2("ahibhi"));
        assertEquals(0, TestingRecursions.countHi2("xhixhi"));
    }

    @Test
    public void testStrCount() {
        assertEquals(2, TestingRecursions.strCount("catcowcat", "cat"));
        assertEquals(1, TestingRecursions.strCount("catcowcat", "cow"));
        assertEquals(0, TestingRecursions.strCount("catcowcat", "dog"));
    }

    @Test
    public void testStringClean() {
        assertEquals("yza", TestingRecursions.stringClean("yyzzza"));
        assertEquals("abcd", TestingRecursions.stringClean("abbbcdd"));
        assertEquals("Helo", TestingRecursions.stringClean("Hello"));
    }
}