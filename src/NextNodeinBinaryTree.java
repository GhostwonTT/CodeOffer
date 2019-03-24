/* *************************************************
 * User: Gordon
 * Date: 23/03/19
 * Description: NextNodeinBinaryTree
 * Give a tree and a node, find the next node of it by inorder
 **************************************************/
import DataStructure.Node;

public class NextNodeinBinaryTree {

    public static int findNextNode(Node point) {

        if (point == null) {
            throw new IllegalArgumentException();
        }

        //if the point has right child, the next point is the leftest point in its right subtree
        Node right = point.right;
        if (right != null) {
            Node previous = right;
            Node left = right.left;
            while (left != null) {
                previous = left;
                left = left.left;
            }
            return previous.value;
        }
        //if the point is the left child of its parent, the next node is its parent
        if (point == point.parent.left) {
            return point.parent.value;
        }

        //if the point is the right child without any right child, check the parent, until it is a left child
        Node parent = point.parent;
        while (parent != parent.parent.left) {
            parent = parent.parent;
        }
        return parent.value;

    }
}
