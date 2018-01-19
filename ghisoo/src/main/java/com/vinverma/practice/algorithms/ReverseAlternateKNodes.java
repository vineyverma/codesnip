package com.vinverma.practice.algorithms;

/**
 * Created by vinverma on 7/24/17.
 */
public class ReverseAlternateKNodes {

  class SingleLinkedList  {

    SingleNode head;
    SingleNode tail;

    SingleLinkedList () {

      head = null;
      tail = null;
    }

    void addFirst(SingleNode first) {
      // empty list
      // only one node
      // multiple nodes
      if (head == null) {

        first.next = null;
        head = first;
        tail = first;

      } else {

          first.next = head;
          head = first;
      }

    }
    // 3 - 4 -  5   -  8

    // addBefore (5)

    void addAfter (SingleNode prev, SingleNode newNode) {

      //corner cases
      // what if there is only one node
      if (prev.value == head.value) {
          prev.next = newNode;
          newNode.next = null;
      }
      // what if list is empty
      if (prev == null) {
        addFirst(newNode);
      }
      // what if this is last node or a node down the chain
      SingleNode current = head;
      while (current != newNode) {
        current = current.next;
      }
      prev.next = current.next;
      current.next = prev;
    }

    void addLast (SingleNode last) {

      if (head == null) {
        head = last;
        tail = last;
      }
      if (last == null) {
        return;
      }

      if (head != null) {

        SingleNode current = head;
        while (current != null) {
          current = current.next;
        }
        current.next = last;
        last.next = null;
        tail = last;
      }
    }
  }

  class SingleNode {

    int value;
    SingleNode next;

    public SingleNode () {

      next = null;

    }

    public SingleNode (SingleNode _next, int val) {

      next = _next;
      value = val;

    }


  }

  // 1 - 2 - 3 - 4 - 5 - 6 -  7 - 8 - 9
  // k = 3
  // 3 - 2 - 1 - 4 - 5 - 6 - 9 - 8 - 7

  public void reverse (SingleNode head, int k) {

    // corner cases
    // what if list is empty
    // what if list has nodes less than k

    // find size of list
    // size % k = slices
    // size = 10
    // k = 4
    // slice = 10 % 4 = 2

    // rev( 1,2)
    // skip (3,4)
    // rev (5,6)
    // skip (7,8)


    // iterate nodes
    // start from 0 until slice
    // skip a slice from slice+1
    // reverse until slice

    SingleNode current = head;
    SingleNode prev = null;

    int count = 0;

    while (current != null && count < k) {
      // reverse
      // 3 - 4 - 5
      SingleNode nextnext = current.next;   // nextnext = 4
      current.next = prev;
      prev = current;
      current = nextnext;
    }

    // skip next until k
    // count = 0;
    while (count < k) {
      current = current.next;
      count++;
    }

    current = current.next;
    count = 0;

    reverse(current, k);


  }



}
