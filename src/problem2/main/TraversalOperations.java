package problem2.main;

import problem1.node.TreeNode;

public class TraversalOperations {
    void printPostorder(TreeNode node) {
        if(node == null)
            return;
        printPostorder(node.getLeft());
        printPostorder(node.getRight());
        System.out.println(node.getData() + " ");
    }
}
