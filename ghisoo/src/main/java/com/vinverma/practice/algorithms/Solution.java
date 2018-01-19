package com.vinverma.practice.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class Solution {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    int[] b1 = {203, 204, 205, 206, 207, 208, 203, 204, 205, 206};
    //int[] b2 = {203,204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204};
    int[] b2 = {203, 204000};

    int a0 = in.nextInt();
    int max = 2 * 10 * 10 * 10 * 10 * 10;
    if (a0 < 1 || a0 > max) {
      System.err.println("Invalid input. exitting");
      System.exit(0);
    }

    int[] arr = new int [a0];
    for (int i=0; i<a0; i++) {
      arr[i] = in.nextInt();
      if (arr [i] > 10 * 10 * 10 * 10) {
        System.err.println ("Invalid input");
        System.exit(0);
      }
    }

    int a1 = in.nextInt();
    int[] arr2 = new int [a1];
    for (int i=0; i<a1; i++) {
      arr2[i] = in.nextInt();
      if (arr2 [i] > 10 * 10 * 10 * 10) {
        System.err.println ("Invalid input");
        System.exit(0);
      }
    }

    if (a1 < 1 || a1 > max || a0 > a1) {
      System.err.println("Invalid input. exit ");
      System.exit(0);
    }

    System.out.println("yeh hai tera kachra");
    System.out.println(Arrays.toString(arr2));

    if (arr2[arr2.length - 1] - arr2[0] > 101) {
      System.err.println("Invalid input. exit program");
      System.exit(0);
    }

    if (arr[arr.length - 1] - arr[0] > 101) {
      System.err.println("Invalid input. exit program");
      System.exit(0);
    }

    frequencyCounter (arr, arr2);

    int[] num = {2, 0, 1, 5};
    int[] num2 = {7, 4, 1, 4, 10};

    //twoSum (num, 8);

  }

  public static int foo(int x) {

    try {
      return x;
    } finally {
      x++;
    }
  }

  // 1 0
  //
  static List<List<Integer>> twoSum(int[] num, int target) {

    List<List<Integer>> twoSumList = new ArrayList<>();
    Map<Integer, Integer> indexMap = new HashMap<>();
    int diff = 0;
    for (int i = 0; i < num.length; i++) {
      diff = target - num[i];
      if (!indexMap.containsKey(num[i])) {
        indexMap.put(diff, i);
      } else {
        // add it to list
        List<Integer> list = new ArrayList<>();
        list.add(i);
        list.add(indexMap.get(num[i]));
        twoSumList.add(list);
      }
    }
    System.out.print(twoSumList);
    if (twoSumList.size() == 0 || twoSumList.isEmpty()) {
      List<Integer> list1 = new ArrayList<>();
      list1.add(-1);
      twoSumList = new ArrayList<>();
      twoSumList.add(list1);
    }
    return twoSumList;
  }

  private static void frequencyCounter (int[] a, int[] b) {

    Arrays.sort(a);

    Map<Integer, Integer> mappy = new HashMap<>();
    int count = 0;
    for (int i = 0; i < a.length; i++) {
      if (mappy.containsKey(a[i])) {
        count = mappy.get(a[i]);
        mappy.put(a[i], ++count);
      } else {
        mappy.put(a[i], 1);
      }
    }
    boolean isExist = false;
    for (int i = 0; i < b.length; i++) {
      isExist = mappy.containsKey(b[i]);
      if (isExist) {
        count = mappy.get(b[i]);
        if (count == 0) {
          mappy.put(b[i], ++count);
        } else {
          mappy.put(b[i], --count);
        }
      }
    }

    //Map<Integer, Integer> collected = mappy.entrySet().stream()
     //   .filter(map -> map.getValue() > 0)
      //  .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));

    Set  set1 = new TreeSet();
    for (Map.Entry<Integer, Integer> entry : mappy.entrySet()) {
      if(entry.getValue() > 0){
        //set1.add(entry.getKey());
        System.out.print (entry.getKey());
      }
    }
    System.out.println (set1);
  }


  private static void testMap() {

    int[] a = {203, 204, 205, 206, 207, 208, 203, 204, 205, 206};
    Map<Integer, Integer> map = new HashMap<>();

    int count = 1;
    for (int i = 0; i < a.length; i++) {

      if (map.containsKey(a[i])) {
        count = map.get(a[i]);
        map.put(a[i], ++count);
      } else {
        map.put(a[i], 1);
      }

    }

    int[] b = {203, 204, 205};
    for (int i = 0; i < b.length; i++) {

      if (map.containsKey(b[i])) {
        count = map.get(b[i]);
        count = count + 100;
        map.put(b[i], count);
      }
    }

    System.out.println("After Map " + map);
    System.out.println("\n\n\n\n");

  }

}
