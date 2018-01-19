package com.vinverma.practice.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by vinverma on 11/19/17.
 */
public class LeftRotate {

  public static void main (String[] args) {

    int[] a = new int[] {1,2,3,4};
    int k = 5;
    System.out.println ("Before Rotation " + Arrays.toString(a));
    if (k == a.length) {
      System.out.println ("nothing to rotate");
      return;
    } else if (k > a.length) {
        k = k - a.length;
    }
    for (int i=0; i<k; i++) {
      int temp = a[a.length-1];
      for (int j=a.length-1; j>0; j--) {
        System.out.println ("Rotate # " + j + " a[j] " + a[j]);
        a[j] = a[j-1];
      }
      a[0] = temp;
    }
    System.out.println ("After Rotation " + Arrays.toString(a));
  }

}
