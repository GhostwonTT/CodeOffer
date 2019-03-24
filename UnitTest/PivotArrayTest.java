import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PivotArrayTest {

    @Test
    void simpleWay() {
        int[] test = {1, 2, 3, 4, 5, -1 , -2};
        Assertions.assertEquals(-1, PivotArray.simpleWay(test));
    }

    @Test
    void searchByBinary() {
        int[] test = {1, 2, 3, 4, 5, 5 , -1};
        Assertions.assertEquals(-1, PivotArray.searchByBinary(test, 0, test.length - 1));
    }

    @Test
    void specialCase() {
        int[] test = {1, 1, 1, 1, 1, 0 , 1};
        Assertions.assertEquals(0, PivotArray.searchByBinary(test, 0, test.length - 1));
    }

    @Test
    void singleCase() {
        int[] test = {1};
        Assertions.assertEquals(1, PivotArray.searchByBinary(test, 0, test.length - 1));
    }
}