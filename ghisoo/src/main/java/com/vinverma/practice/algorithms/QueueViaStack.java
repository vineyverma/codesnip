package com.vinverma.practice.algorithms;

import java.util.Stack;

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

public class QueueViaStack  {

  int size = 0;

  Stack<Integer> st1 = new Stack<>();
  Stack<Integer> st2 = new Stack<>();

  public void push (int x) {

    st2.push (x);

  }

  public int pop() {

    int data = 0;

    if (st2.isEmpty()) {
      System.err.println ("Nothing to pop");
      return -1;
    }

    if (!st2.isEmpty()) {
      while (!st2.isEmpty()) {
        st1.push(st2.pop());
        size--;
      }
    }

    if (!st1.isEmpty()) {
      data = st1.pop();
      while (!st1.isEmpty()) {
        st2.push(st1.pop());
      }
    }

    return data;
  }

  // 2
  // 3 move 2 to st2
  // 4 move 3 2
  // pop
  // st1 push 4 3 2 (pop) = 2
  // push 5 st1 -  st2 3 4
  // pop
  // 4 3 5

  // 2 st2 3 st2 4 st2  - 4 3 2
  // pop
  // st1.pushAll st2
  // st1.pop
  // st2.push(st1.All) - 4 3

  // 2 3 4
  // 4 3 2 - st1
  // pop
  // push in st2 - 2 3 4 - pop from st2
  // st2 - 3 4
  // push 5

  void pushDeQueue (int x) {

    if (st1.isEmpty())
      st2.push (x);

    while (!st1.isEmpty()) {
      st2.push (st1.pop());
    }

  }

  int popDeQueue() {

    int data = -1;

    if (st2.isEmpty()) {
      System.err.println ("Stack Empty ");
      return -1;

    }

    while (!st2.isEmpty()) {
      st1.push (st2.pop());
    }

    if (!st1.isEmpty())
      data = st1.pop();

    while (!st1.isEmpty()) {

      st2.push (st1.pop());

    }

    return data;

  }

  public int size() {

    return size;
  }

  public static void main (String[] args) {

    QueueViaStack queueViaStack = new QueueViaStack();

    //queueViaStack.push(2);
    //queueViaStack.push(3);
    //queueViaStack.push(4);
    //queueViaStack.push(5);

    queueViaStack.pushDeQueue(2);
    queueViaStack.pushDeQueue(3);
    queueViaStack.pushDeQueue(4);

    System.out.println ("Size " + queueViaStack.size);


    System.out.println ("st1 " + queueViaStack.st1);
    System.out.println ("st2 " + queueViaStack.st2);

    System.out.println ("pop " + queueViaStack.popDeQueue());//pop());
    System.out.println ("pop " + queueViaStack.popDeQueue());//pop());
    System.out.println ("pop " + queueViaStack.popDeQueue());//pop());

    System.out.println ("push 5 ");
    queueViaStack.pushDeQueue(5);
    System.out.println ("push 6 ");
    queueViaStack.pushDeQueue(6);

    System.out.println ("pop " + queueViaStack.popDeQueue());//pop());
    System.out.println ("pop " + queueViaStack.popDeQueue());//pop());
    System.out.println ("pop " + queueViaStack.popDeQueue());//pop());




  }

}
