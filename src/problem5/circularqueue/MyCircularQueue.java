/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;

import problem5.node.Node;

//to implement circular queue
public class MyCircularQueue {
    private Node front, tmp, end;

    public MyCircularQueue() {
        front = null;
        tmp = null;
        end = null;
    }

    public Node setFront() {
        return front;
    }

    public void setFront(Node front) {
        this.front = front;
    }

    public Node getTmp() {
        return tmp;
    }

    public void setTmp(Node tmp) {
        this.tmp = tmp;
    }
    public void enqueue(Node newNode) {
        if (front == null) {
            tmp = front = newNode;
            return;
        }
        if (tmp.getNext() == null) {
            tmp.setNext(newNode);
            newNode.setNext(tmp);
            end = newNode;
            return;
        }
        newNode.setNext(tmp.getNext());
        tmp.setNext(newNode);

    }
    public void printQueue() {
        tmp = front;
        try {
            do {
                System.out.println(tmp.getS().toString());
                tmp = tmp.getNext();
            }
            while (tmp != front && tmp != null);
        } catch (NullPointerException ignored) {
        }
    }
}