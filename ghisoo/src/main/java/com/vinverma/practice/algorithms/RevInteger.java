package com.vinverma.practice.algorithms;

/**
 * Created by vinverma on 1/13/18.
 */
public class RevInteger {

  public static void main (String [] args) {


    int output = 987654321;
    int expectedOutput = 321;

    /*

    123         12
    120

      3


   10 123 12
      120
                  3


    12  1
    10

                  1

    12            2



     */

    System.out.println ("NOT reversed :" + output);

    int reversed = 0;
    while (output !=0) {

      reversed = reversed *10 + output %10;
      output = output / 10;

    }

    System.out.println ("reversed :" + reversed);

  }

}
