package com.vinverma.practice.algorithms;

/*

A string S of lowercase letters is given. We want to partition this string into as many parts as possible
so that each letter appears in at most one part, and return a list of integers
representing the size of these parts.

Example 1:
Input: S = "ababcbacadefegdehijhklij"
Output: [9,7,8]
Explanation:
The partition is "ababcbaca", "defegde", "hijhklij".
This is a partition so that each letter appears in at most one part.
A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits S into less parts.
Note:

S will have length in range [1, 500].
S will consist of lowercase letters ('a' to 'z') only.

 */
public class PartitionLabel {

  public static void main (String[] args) {

    double d1 = 625;
    testSquareRootOfDouble(d1);
  }

  //4 9 16 25 36 49 64 81 100 121 144

  public static int testSquareRootOfDouble(double d1) {

    if (d1 == 1) {
      return 1;
    }
    for (int i =2; i < d1/2; i++) {
      System.out.println ("i " + i);
      if (i * i == d1) {
        System.out.println ("Square Root of " + d1 + " = " + i);
        return i;
      }
    }
    /*
      1 to n
      if (1* 1) = n
       then print 1
          125
     */
    return -1;
  }

}
