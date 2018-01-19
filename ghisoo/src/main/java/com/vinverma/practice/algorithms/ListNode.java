package com.vinverma.practice.algorithms;

/**
 * Created by vinverma on 7/20/17.
 */
public class ListNode {

  Node head;
  Node tail;

  Node next;
  int data;

  public ListNode(int _data) {

    next = null;
    data=_data;
  }

  public ListNode (Node next, int data) {

    this.next = next;
    data = data;
  }

  public void addFirst(Node next) {

    if (head == null) {

      head = next;

    } else {

        next.next = head;
        head = next;

    }
  }

  public void addBetween (Node node1, Node node2) {

  }



  public void addLast() {

  }

  public void addBefore() {

  }

  public void traverse() {

  }

}
