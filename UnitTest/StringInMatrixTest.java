import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringInMatrixTest {

    @Test
    void path() {
        char[][] test = {{'a', 'b', 't', 'g'}, {'c', 'f', 'c', 's'}, {'j', 'd', 'e', 'h'}};
        Assertions.assertEquals(true, StringInMatrix.existThePath("bfce", test));
        Assertions.assertEquals(true, StringInMatrix.existThePath("jd", test));
        Assertions.assertEquals(false, StringInMatrix.existThePath("aadd", test));
        Assertions.assertEquals(false, StringInMatrix.existThePath("abfb", test));
    }

    @Test
    void emptyMatrix() {
        StringInMatrix.existThePath("", null);
    }

    @Test
    void specialCase() {
        char[][] test = {{'a', 'b', 't', 'g'}};
        Assertions.assertEquals(true, StringInMatrix.existThePath("ab", test));
        char[][] test2 = {{'a'},{'b'}, {'t'}, {'g'}};
        Assertions.assertEquals(true, StringInMatrix.existThePath("ab", test));
    }
}