/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.node;

public class Node {
    private int data;
    private Node next;
    private int priority;
    public Node(int data, int priority) {
        this.data = data;
        this.next = null;
        this.priority = priority;
    }
}
