/* *************************************************
 * User: Gordon
 * Date: 16/03/19
 * Description: PrintLinkListFromTail
 * no fix length, need to point to new node when adding nodes
 **************************************************/

import java.util.Stack;

public class PrintLinkListFromTail {


    private static final int NODE_VALUES = 10;
    private Node node;

    public PrintLinkListFromTail() {
        this.node = new Node();
        this.node.value = 11;
        for (int i = 0; i < NODE_VALUES; i++) {
            node.addNewNode(NODE_VALUES - i);
        }
    }

    private class Node<Item> {
        Item value;
        Node next;

        private void addNewNode(Item value) {
            Node newNode = new Node();
            newNode.value = value;
            newNode.next = null;

            if (this.next == null) {
                this.next = newNode;
                return;
            }

            Node old = this.next;
            while (old.next != null) {
                old = old.next;
            }
            old.next = newNode;
        }
    }


    public static void main(String[] args) {

        PrintLinkListFromTail test = new PrintLinkListFromTail();
        Stack<Integer> nodes = new Stack<>();
        Node node = test.node;
        while (node  != null) {
            nodes.push((Integer) node.value);
            node = node.next;
        }
        for (int i : nodes) {
            System.out.println(i);
        }
        System.out.println(test.toString());
    }
}
