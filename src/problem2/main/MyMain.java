/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String [] args) {
    TraversalOperations t = new TraversalOperations();
    MyBinarySearchTree obj = new MyBinarySearchTree();
    TreeNode root = new TreeNode(7);
    obj.insert(root , 5);
    obj.insert(root , 12);
    obj.insert(root , 34);
    obj.insert(root , 7);
    obj.insert(root , 14);
    obj.insert(root , 35);
    obj.insert(root , 65);
    t.printPreorder(root);
    System.out.println();
    t.printPostorder(root)



    }
}