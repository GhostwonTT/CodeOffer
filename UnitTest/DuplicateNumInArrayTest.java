import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class DuplicateNumInArrayTest {

    @BeforeEach
    void setUp() {


    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void existDuplicateNum() {
        int[] test = {1, 2, 3, 4, 4, 5, 6, 7, 4, 6};
        Assertions.assertTrue(DuplicateNumInArray.existDuplicateNum(test));
    }

    @Test
    void noDuplicate() {
        int[] test = {0, 2, 3, 1};
        Assertions.assertFalse(DuplicateNumInArray.existDuplicateNum(test));
    }

    @Test
    void nonValidInput() {
        int[] test = new int[0];
//        DuplicateNumInArray.existDuplicateNum(test);
        System.out.println(test == null);
    }
}