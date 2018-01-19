package com.vinverma.practice.algorithms;

/**
 * Created by vinverma on 8/9/17.
 */
public class ParaPrakriti extends Thread {

  static boolean isRunning = true;

  public void run () {

    System.out.println(" Thread " + Thread.currentThread().getName() + " started");
    int i=1;

    while (i<6) {

      System.out.println(i + " Thread " +
          Thread.currentThread().getName() +
          " isRunning   " + isRunning);

      isRunning = true;


      try {
        Thread.currentThread().sleep(1000);
      } catch(Exception er) {
        er.printStackTrace();
      }

      i++;

    }

  }



  public static void main (String[] args) {

    Thread t1 = new Thread (new ParaPrakriti());
    t1.setName("Buntoo");

    t1.start();

    //System.out.println ("Is t1 running? " + t1.isAlive());

      while (t1.isAlive()) {

        ParaPrakriti.isRunning = false;
        //System.out.println ("Is t1 running? " + t1.isAlive());
        System.out.println ("main.Main thread..." + Thread.currentThread().getName() +
            " isRunning:  " + isRunning);

        try {
          Thread.currentThread().sleep(1000);
        } catch(Exception er) {
          er.printStackTrace();
        }
      }
    //Thread t2 = new Thread (new main.AparaPrakrti());


  }

}
