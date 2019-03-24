import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RobotWalkRangeTest {

    @Test
    void emptyK() {
        int k = -1;
        Assertions.assertEquals(0, RobotWalkRange.numOfRange(2, 2, k));
    }

    @Test
    void emptyMatrix() {
        int k = 1;
        Assertions.assertEquals(0, RobotWalkRange.numOfRange(0, 0, k));
    }

    @Test
    void findTheNum() {
        int k = 1;
        Assertions.assertEquals(3, RobotWalkRange.numOfRange(2, 2, k));
    }
}