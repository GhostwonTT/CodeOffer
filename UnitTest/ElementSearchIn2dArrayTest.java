import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElementSearchIn2dArrayTest {

    @Test
    void findElementByDiagonal() {
        int[][] test = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        boolean result = ElementSearchIn2dArray.findElementByDiagonal(test, 7);
        Assertions.assertEquals(true, result);
    }

    @Test
    void notInaneArray() {
        int[][] test = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        boolean result = ElementSearchIn2dArray.findElementByDiagonal(test, 16);
        Assertions.assertEquals(false, result);
    }

    @Test
    void notMinInaneArray() {
        int[][] test = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        boolean result = ElementSearchIn2dArray.findElementByDiagonal(test, -1);
        Assertions.assertEquals(false, result);
    }


}