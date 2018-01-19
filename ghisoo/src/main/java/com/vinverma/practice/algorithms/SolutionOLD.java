package com.vinverma.practice.algorithms; /**
 * Created by vinverma on 1/9/17.
 */

import java.util.Scanner;


public class SolutionOLD {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    String a0 = in.nextLine();
    String s = in.nextLine();
    String[] s1 = s.split(" ");
    int[] a = new int[s1.length];
    for (int j=0; j<s1.length; j++) {
      a[j] = Integer.parseInt(s1[j]);
    }
    printFraction(a);

  }

@org.testng.annotations.Test
public void testOdd() {

    int[] a = {1, 2, 3, 2, 3, 5, 6, 5, 1, 3, 5, 7};
    int[] counter = new int[a.length];

    // add to Java set
    // it returns true if eleemnt is unique
    // false otherwise

    /*
    Set set = new HashSet();

    for (int i = 0; i < a.length - 1; i++) {

      boolean b = set.add(a[i]);
      if (!b) {
        System.out.println ("Odd");
      }

    }*/

    int count = 0;

      for (int i = 0; i < a.length; i++) {
        System.out.println ();
        count = 0;
          for (int j = 0; j < a.length; j++) {
            if (a[i] == a[j]) {
              count++;
            }
            //System.out.println ("a[i] " + a[i] +  " a[j] " + a[j] + " count " + count);
          }
      if (count % 2 != 0) {

        System.out.println (" Odd Number " + a[i] + " Count " + count);
      }
    }
  }

  // ## Option2, Add numbers in Map, Increment Count
  // iterator over Map, count %2 !=0 are the ones..

  // Quick Sort
  //

  static void printFraction(int[] a) {

    int positiveCount = 0;
    int negativeCount = 0;
    int zerosCount = 0;

    float pos = 0.00000f;
    float negative = 0.00000f;
    float z = 0.00000f;

    for (int i = 0; i < a.length; i++) {

      if (a[i] < 0.0) {
        negativeCount++;
      } else if (a[i] == 0) {
        zerosCount++;
      } else {
        positiveCount++;
      }
    }
    pos = (float) positiveCount/ (float) a.length;
    negative = (float)negativeCount/ (float) a.length;
    z = (float)zerosCount/ (float) a.length;
    System.out.println (String.format("%.5f",pos));
    System.out.println (String.format("%.5f",negative));
    System.out.println (String.format("%.5f",z));


  }


}

