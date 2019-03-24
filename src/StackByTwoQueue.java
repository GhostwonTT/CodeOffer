/* *************************************************
 * User: Gordon
 * Date: 23/03/19
 * Description: StackByTwoQueue
 * Use two queue to simulate one stack
 **************************************************/

import java.util.LinkedList;
import java.util.Queue;

public class StackByTwoQueue<Item> {

    private Queue<Item> queueOne;
    private Queue<Item> queueTwo;

    public StackByTwoQueue() {
        this.queueOne = new LinkedList<>();
        this.queueTwo = new LinkedList<>();
    }

    public void appendTail(Item item) {
        this.queueOne.add(item);
    }

    public Item deleteHead() {
        if (this.queueOne.size() > 0) {
            while (this.queueOne.size() > 1) {
                this.queueTwo.add(this.queueOne.remove());
            }
            return this.queueOne.remove();
        } else {
            while (this.queueTwo.size() > 1) {
                this.queueOne.add(this.queueTwo.remove());
            }
            return this.queueTwo.remove();
        }
    }
}
