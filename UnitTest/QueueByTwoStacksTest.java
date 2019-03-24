import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class QueueByTwoStacksTest {

    @Test
    void addToEmpty() {
        QueueByTwoStacks test = new QueueByTwoStacks();
        test.appendTail(1);
        Assertions.assertEquals(1, test.deleteHead());

    }

    @Test
    void addToExist() {
        QueueByTwoStacks test = new QueueByTwoStacks();
        test.appendTail(1);
        test.appendTail(2);
        test.appendTail(3);
        test.appendTail(4);
        Assertions.assertEquals(1, test.deleteHead());
    }

    @Test
    void deleteUntilEmpty() {
        QueueByTwoStacks test = new QueueByTwoStacks();
        test.appendTail(1);
        test.appendTail(2);
        test.appendTail(3);
        test.appendTail(4);
        Assertions.assertEquals(1, test.deleteHead());
        Assertions.assertEquals(2, test.deleteHead());
        Assertions.assertEquals(3, test.deleteHead());
        Assertions.assertEquals(4, test.deleteHead());

    }
}