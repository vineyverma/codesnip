package com.vinverma.practice.algorithms;

/**
 * Created by vinverma on 10/29/17.
 */
public class DeadLockTest {

  static class Thread1 extends Thread {

    public void method1() {

      synchronized (String.class) {

        System.out.println("Thread 1 String...");

        synchronized ((Integer.class)) {

          System.out.println("Thread 1 Integer...");

        }
      }
     }

     public void run() {
       method1();
     }

  }


  static class Thread2 extends Thread {

    public void method2() {

      synchronized (String.class) {

        System.out.println ("Thread 2 String...");

        synchronized ( (Integer.class)) {

          System.out.println ("Thread 2 Integer...");

        }
      }
    }

    public void run() {
      method2();
    }


  }

  public static void main (String[] args) {

    Thread1 t1 = new Thread1();
    t1.setName("ThreadOne");
    t1.start();

    Thread2 t2 = new Thread2();
    t2.setName("ThreadTwo");
    t2.start();
  }

}
