import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImmutableDuplicateNumInArrayTest {

    @Test
    void findDuplicateNum() {
        int[] test = {4, 4, 4, 4, 5, 2};
        Assertions.assertEquals(4, ImmutableDuplicateNumInArray.findDuplicateNum(test));
    }

    @Test
    void validInput() {
        int[] test = null;
        ImmutableDuplicateNumInArray.findDuplicateNum(test);
    }

    @Test
    void findDuplicateNumSpaceOpimization() {
        int[] test = {1, 4, 4, 4, 5, 2};
        Assertions.assertEquals(4, ImmutableDuplicateNumInArray.findDuplicateNumByBinarySearch(test));
    }

}