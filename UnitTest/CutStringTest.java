import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CutStringTest {

    @Test
    void maxResultByDP() {
        Assertions.assertEquals(0, CutString.maxResultByDP(0));
        Assertions.assertEquals(0, CutString.maxResultByDP(1));
        Assertions.assertEquals(1, CutString.maxResultByDP(2));
        Assertions.assertEquals(2, CutString.maxResultByDP(3));
        Assertions.assertEquals(4, CutString.maxResultByDP(4));
        Assertions.assertEquals(729, CutString.maxResultByDP(18));
    }

    @Test
    void maxResultByGreedy() {
        Assertions.assertEquals(0, CutString.maxResultByGreedy(0));
        Assertions.assertEquals(0, CutString.maxResultByGreedy(1));
        Assertions.assertEquals(1, CutString.maxResultByGreedy(2));
        Assertions.assertEquals(2, CutString.maxResultByGreedy(3));
        Assertions.assertEquals(4, CutString.maxResultByGreedy(4));
        Assertions.assertEquals(729, CutString.maxResultByGreedy(18));
    }
}