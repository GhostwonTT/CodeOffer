import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReplaceSpaceInStringTest {


    @Test
    void stringWithOneSpace() {
        String one = " abcd";
        String two = "abcd ";
        String three = "ab cd";
        Assertions.assertEquals(ReplaceSpaceInString.replaceSpace(one), "%20abcd");
        Assertions.assertEquals(ReplaceSpaceInString.replaceSpace(two), "abcd%20");
        Assertions.assertEquals(ReplaceSpaceInString.replaceSpace(three), "ab%20cd");
    }

    @Test
    void stringWithMultipleSpace() {
        String one = " abcd ";
        String two = "abcd  ";
        String three = "a b c d";
        Assertions.assertEquals(ReplaceSpaceInString.replaceSpace(one), "%20abcd%20");
        Assertions.assertEquals(ReplaceSpaceInString.replaceSpace(two), "abcd%20%20");
        Assertions.assertEquals(ReplaceSpaceInString.replaceSpace(three), "a%20b%20c%20d");
    }

    @Test
    void stringWithNoSpace() {
        String one = "abcd";
        Assertions.assertEquals(ReplaceSpaceInString.replaceSpace(one), "abcd");
    }

}