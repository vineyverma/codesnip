package com.vinverma.practice.algorithms;

import java.util.LinkedList;
import java.util.Queue;

// 2 3 4

/*

2
3
4



st1.push (2)
3 - take 2 out from st1, put it in st2
now push 2 in st2

pop
remove all from st2, put it in st1
pop from st1

 */
// st1 2 3 4 -(2) =>  3  4

//st2   5 4 3

// pop from st2, put it in st1
// pop from st1

// push 5 now
//

// push 2 in st1
// push 3
// pop 2, put it in st2
// push 3 in st1

// push 4
// pop 3, put it in st2
// push 4

//pop
// pop from st1 (you get 2)

//

public class StackViaQueue {

  int size = 0;

  Queue<Integer> q1 = new LinkedList<>();
  Queue<Integer> q2 = new LinkedList<>();

  int last = -1;

  public void push (int x) {

    q2.offer(x);


  }

  public int pop() {

    if (q2.isEmpty()) {
      System.err.println ("Stack is Empty; Nothing to pop");
    }
    while (!q2.isEmpty()) {
      q1.offer(q2.remove());
    }
    while (!q1.isEmpty()) {
      int last = q1.remove();
      if (!q1.isEmpty()) {
        q2.offer(last);
      } else {
        return last;
      }
    }
    return -1;
  }


  public int size() {

    return size;
  }

  public static void main (String[] args) {

    StackViaQueue queueViaStack = new StackViaQueue();

    queueViaStack.push(2);
    queueViaStack.push(3);
    //queueViaStack.push(4);

    System.out.println ("Size " + queueViaStack.size);

    System.out.println ("q1 " + queueViaStack.q1);
    System.out.println ("q2 " + queueViaStack.q2);

    System.out.println ("pop " + queueViaStack.pop());
    System.out.println ("pop " + queueViaStack.pop());


    System.out.println ("push 5 ");
    queueViaStack.push(5);
    System.out.println ("push 6 ");
    queueViaStack.push(6);

    System.out.println ("pop " + queueViaStack.pop());
    System.out.println ("pop " + queueViaStack.pop());

    System.out.println ("pop " + queueViaStack.pop());




  }

}
