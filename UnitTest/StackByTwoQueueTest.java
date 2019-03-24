import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackByTwoQueueTest {

    @Test
    void addToEmpty() {
        StackByTwoQueue test = new StackByTwoQueue();
        test.appendTail(1);
        test.appendTail(2);
        Assertions.assertEquals(2, test.deleteHead());
    }

    @Test
    void addToExist() {
        StackByTwoQueue test = new StackByTwoQueue();
        test.appendTail(1);
        test.appendTail(2);
        test.appendTail(3);
        test.appendTail(4);
        Assertions.assertEquals(4, test.deleteHead());
    }

    @Test
    void deleteToEmpty() {
        StackByTwoQueue test = new StackByTwoQueue();
        test.appendTail(1);
        test.appendTail(2);
        Assertions.assertEquals(2, test.deleteHead());
        Assertions.assertEquals(1, test.deleteHead());
        test.appendTail(3);
        test.appendTail(4);
        Assertions.assertEquals(4, test.deleteHead());
        Assertions.assertEquals(3, test.deleteHead());

    }


}