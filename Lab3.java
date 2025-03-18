import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Lab3 {

    private static void check(String input, boolean expected) {
        boolean result = AmazonBackend.checkCode(input);
        assertEquals(expected, result);
    }

    @Test
    public void test1() {
        check("1.Word ", true);
    }

    @Test
    public void test2() {
        check("999.Word ", true);
    }

    @Test
    public void test3() {
        check("1000.Word ", false);
    }

    @Test
    public void test4() {
        check("01.Word ", false);
    }

    @Test
    public void test5() {
        check("00999.Word ", false);
    }

    @Test
    public void test6() {
        check("1.One Two Three ", true);
    }

    @Test
    public void test7() {
        check("1.One   Two   Three ", false);
    }

    @Test
    public void test8() {
        check("1.Word         ", true);
    }

    @Test
    public void test9() {
        check("1.Word", false);
    }

    @Test
    public void test10() {
        check("1.Word 12345", true);
    }

    @Test
    public void test11() {
        check("1.One Two Three     12345", true);
    }

    @Test
    public void test12() {
        check("1.Word 123", false);
    }

    @Test
    public void test13() {
        check("1.Word 123456", false);
    }

    @Test
    public void test14() {
        check("1.Word 12ab5", false);
    }

    @Test
    public void test15() {
        check("111.OnE TwO ThReE 12345", true);
    }

}