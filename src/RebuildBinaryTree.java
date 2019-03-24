/* *************************************************
 * User: Gordon
 * Date: 23/03/19
 * Description: RebuildBinaryTree to rebuild the binary tree
 * input is the preorder and inorder
 **************************************************/

import java.util.Arrays;

public class RebuildBinaryTree {

    private int[] preorder;
    private int[] inorder;
    private BinaryTree rebuild;

    public RebuildBinaryTree(int[] preorder, int[] inorder) {
        validOrder(preorder);
        validOrder(inorder);
        this.preorder = preorder;
        this.inorder = inorder;
        this.rebuild = rebuildBinaryTree(preorder, inorder);
    }
    private class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;
    }
    /**
     * the first node in preorder is root node, then check the inorder,
     * the nodes on the left side of root node is the left subtree, the right side is the right subtree
     */
    /**
     *
     * @param preorder (no duplicate num)
     * @param inorder (no duplicate num)
     */
    public BinaryTree rebuildBinaryTree(int[] preorder, int[] inorder) {

        BinaryTree node = new BinaryTree();

        if (preorder.length == 0 || inorder.length == 0) {
            return null;
        }
        if (preorder.length == 1 || inorder.length == 1) {
            node.value = preorder[0];
            node.left = null;
            node.right = null;
            return node;
        }

        int root = preorder[0];
        node.value = root;
        int position = searchPosition(root, inorder);
        node.left = rebuildBinaryTree(Arrays.copyOfRange(preorder, 1, position + 1), Arrays.copyOfRange(inorder, 0, position));
        node.right = rebuildBinaryTree(Arrays.copyOfRange(preorder, position + 1, preorder.length), Arrays.copyOfRange(inorder, position + 1, preorder.length));
        return node;
    }

    private void validOrder(int[] order) {
        if (order == null || order.length == 0) {
            throw new IllegalArgumentException();
        }
    }

    private int searchPosition(int root, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == root) {
                return i;
            }
        }
        return -1;
    }



}
