/* *************************************************
 * User: Gordon
 * Date: 23/03/19
 * Description: QueueByTwoStacks
 * implemnt the queue structure by two stacks
 **************************************************/

import java.util.Stack;

public class QueueByTwoStacks<Item> {

    private Stack<Item> stackOne;
    private Stack<Item> stackTwo;

    public QueueByTwoStacks() {
        this.stackOne = new Stack<>();
        this.stackTwo = new Stack<>();
    }

    public void appendTail(Item item) {
        this.stackOne.push(item);
    }

    public Item deleteHead() {
        if (this.stackTwo.size() > 0) {
            return this.stackTwo.pop();
        } else {
            while (this.stackOne.size() > 0) {
                this.stackTwo.push(this.stackOne.pop());
            }
            return this.stackTwo.pop();
        }
    }
}
