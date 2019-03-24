import org.junit.jupiter.api.Test;

class RebuildBinaryTreeTest {

    @Test
    void normalTree() {
        int[] preorder = {1, 2, 4, 5, 3, 6 ,7};
        int[] inorder = {4, 2, 5, 1, 6, 3, 7};
        RebuildBinaryTree test = new RebuildBinaryTree(preorder, inorder);
    }

    @Test
    void notCompleteTree() {
        int[] preorder = {1, 2, 4, 3, 6};
        int[] inorder = {4, 2, 1, 6, 3};
        RebuildBinaryTree test = new RebuildBinaryTree(preorder, inorder);
    }

    @Test
    void onlyLeftTree() {
        int[] preorder = {1, 2, 3, 5, 4, 6};
        int[] inorder = {5, 3, 2, 6, 4, 1};
        RebuildBinaryTree test = new RebuildBinaryTree(preorder, inorder);
    }

    @Test
    void onlyRightTree() {
        int[] preorder = {1, 2, 3, 5, 4, 6};
        int[] inorder = {1, 5, 3, 2, 4, 6};
        RebuildBinaryTree test = new RebuildBinaryTree(preorder, inorder);
    }

}