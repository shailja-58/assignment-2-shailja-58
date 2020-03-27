/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

import javax.swing.tree.TreeNode;
import java.util.Enumeration;

public abstract class MyMain {
    public static void main(String [] args) {
        MyBinarySearchTree obj = new MyBinarySearchTree();
        TreeNode root;
        root = new TreeNode(8);
        obj.insert(root , 6);
        obj.insert(root , 3);
        obj.insert(root , 5);
        obj.insert(root , 7);
        obj.insert(root , 9);
        obj.insert(root , 2);
        obj.insert(root , 1);
        obj.insert(root , 11);
        obj.leftView(root);

        }
    }

