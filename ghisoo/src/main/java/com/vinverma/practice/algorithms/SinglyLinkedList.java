package com.vinverma.practice.algorithms;

import java.util.LinkedList;

/**
 * Created by vinverma on 11/9/16.
 */
public class SinglyLinkedList {

    LinkedList node;

    Node head;
    Node tail;

    public SinglyLinkedList(Node head, Node tail) {

        this.head = head;
        this.tail = tail;
    }

    public void addFirst(Node newNode) {

        if (newNode == null) {
            return;
        } else {
            if (head != null) {
                head.next = newNode;
            } else {
                head = newNode;
                head.value = newNode.value;
            }
        }
    }

    void addLast(Node newNode) {

        if (newNode == null) {
            return;
        }
        if (head == null) {
            head = newNode;
            head.next = null;
        } else {
            if (head.next == null) {
                head.next = newNode;
                newNode.next = null;
            } else {
                Node current = head;
                while (head.next != null) {
                    head = head.next;
                }
                head.next = newNode;
                newNode.next = null;
            }
        }
    }

    // 4 -> 5 -> 7 ->[a] -> 8 -> 9 -> null;

    void addBefore(Node newNode, Node prev) {

        if (newNode == null) {
            System.err.println ("Invalid main.Node");
            return;
        }

        if (prev == null) {
            newNode.next = null;
            head = newNode;
        }

        if (head.next == null) {

            newNode.next = head;
            head = newNode;
            tail = newNode;

        } else {

            while (head != prev) {
                head = head.next;
             }
             newNode.next = prev.next;
             prev.next = newNode;
        }
    }

    // 4  -> 5 -> 6 -> 7 -> 8 -> 9 -> 10
    int delete(Node removeMe) {

        if (removeMe == null) {
            System.err.println ("Invalid main.Node : " + removeMe.value);
            return -1;
        }

        if (head.next == null) {

            if (head.value == removeMe.value) {
                head = null;
            } else {
                System.err.println ("main.Node not found ");
                return -1;
            }

        } else {

            Node prevBeforeRemoveMe = null;
            Node afterRemoveMe = null;

            while (head != removeMe) {
                prevBeforeRemoveMe = head;
                head = head.next;
            }
            afterRemoveMe = removeMe.next;
            prevBeforeRemoveMe.next = removeMe.next;

            removeMe.next = null;
            removeMe = null;

            return 0;

        }

        return -1;

    }

    void traverse() {

        if (head == null)
            return;

         while (head != null) {
             System.out.println ("main.Node: " + head.value);
             head = head.next;
         }
    }


    public static void main (String[] args) {

        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(40);

        SinglyLinkedList list = new SinglyLinkedList(null,null);

        list.addFirst(node1);
        list.addLast(node2);
        list.addLast(node3);
        list.addLast(node4);


        list.traverse();

    }
}
