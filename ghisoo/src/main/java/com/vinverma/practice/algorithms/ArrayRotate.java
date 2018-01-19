package com.vinverma.practice.algorithms;

import java.util.Arrays;
import java.util.Scanner;
import org.testng.Assert;

public class ArrayRotate {

  public static void main (String[] args) {

    Scanner in = new Scanner(System.in);

    int arrLength = in.nextInt();
    int [] a = new int[arrLength];
    int numRotation = in.nextInt();

    if (numRotation > arrLength) {
      System.err.println("Invalid input. exitting");
      System.exit(0);
    }

    int i = 0;
    while ( i < arrLength) {
      a[i++] = in.nextInt();
    }

  }


  @org.testng.annotations.Test
  public void testArr () {

    int[] a = {5,4,2,3,1};
    int[] b = rotate(a, 5);
    int[] c = { 1,5,4,2,3};

    int[] shuffledArr = {-1,3,4,-5};


    Assert.assertEquals(c, b);

  }

  public int[] rotate(int[] a, int d) {

    System.out.println ( "d " + d + " before " + Arrays.toString(a));

    int i=0;
    int k=0;

    if (d >= a.length) {
      return new int[] {-1,-1};
    }

    while (i < d) {

      int temp = a[0];

      for (int j=1; j < a.length; j++) {

        k = j -1;

        a[k] = a[j];
      }

      a[a.length-1] = temp;
      i++;

    }

    System.out.println ( "after " + Arrays.toString(a));
    return a;

  }

  /*
   0   1   2    3   4    5   6
  {-1, 1 , 5 , -9 , 7 , -3, -5
  {-1, -9 , 5 , 1 , 7 , -3, -5
  {-1, -9 , -3 , 1 , 7 , 5, -5
  {-1, -9 , -3 , -5 , 7 , 5, 1

  {-1, -9 , -3 , -5 , 7 , 5, 1

i=1
j=4,5, i=2
j=6, i=3

i=4
   */
  //@Test
  public void testSortNegativePositive() {

    int[] shuffledArr = {-1, 1 , 5 , -9 , 7 , -3,-5,10,-10};
    //sequence(shuffledArr);
    sortNumbers(shuffledArr);

  }
  /*

  Given an array of integers (positive and negative numbers),
  sort the array in the following way:
  all the negative numbers are in the front and all
  the positive numbers are in the end, while keeping the relative position.

  eg.
  input: -1,1,5,-9,4,-3
  output: -1,-9,-3,1,5,4
  Do this in O(n) time complexity and O(1) space complexity.


  -1
    1 5
  -9
    4
 -3

   */
  public void sequence (int[] shuffledArr) {

   // iterate
    // add positiv numbers to string with tokenizer ,
    // print negative
    // tokenize string and print numbers or update the array
    // by keeping track of count of negative numbers

    int[] bc = new int[shuffledArr.length/2];

    int k = 0;
    int l = 0;

    for (int i=0; i < shuffledArr.length; i++) {

      if (shuffledArr[i] < 0) {

        shuffledArr [k++] = shuffledArr [i];

      } else {

         bc[l++] = shuffledArr[i];

      }
      System.out.println (" i : "  + i + " l : " + l);
    }

    for (int i = 0; i < bc.length; i++) {

      shuffledArr[k++] = bc[i];

      System.out.println (" k : "  + k);

    }

    System.out.println (Arrays.toString(shuffledArr));

  }

  public void sortNumbers(int[] A) {
    int a = 0;
    int b = A.length - 1;
    for (int i = 0; i < A.length && i <= b; i++) {
      int cur = A[i];
      if (cur < 0) {
        this.swap(A, i, a);
        a++;
      } else if (cur > 0) {
        this.swap(A, i, b);
        b--;
        i--;
      }
    }
    System.out.println (Arrays.toString(A));
  }

  private void swap(int[] A, int i, int j) {
    int tmp = A[i];
    A[i] = A[j];
    A[j] = tmp;
  }

  //@Test
  public void partition () {

    int[] a = {1, -1 , 5 , -9 , 7 , -3,-5,-10,10};

    System.out.println (Arrays.toString(a));
    int i = 0;
    int j = a.length -1 ;
    int temp = 0;

    while (i < j ) {

      if (a[i] > 0 && a[j] < 0) {
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        i++; j--;
        System.out.println ("i:" + i + " j: " + j + " a[i] " + a[i] + " a[j] " + a[j]);
      }

      if (a[i] < 0){
          i++;
          System.out.println ("i:" + i + " a[i] " + a[i] + " a[j] " + a[j]);
      }

      if (a[j] > 0) {
          j--;
          System.out.println (" j: " + j + " a[i] " + a[i] + " a[j] " + a[j]);
      }
    }

    System.out.println (Arrays.toString(a));
  }

  void swap (int a, int b) {
    int temp = 0;

  }


}
