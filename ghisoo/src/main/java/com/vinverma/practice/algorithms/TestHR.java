package com.vinverma.practice.algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by vinverma on 8/23/17.
 */
public class TestHR {


  static int search(int[] B, int target) {

    // array is sorted and rotated which means there is an element after which elements will change order and go decreasing
    // or smaller than pivot

    // <decreasing> <pivot> <increasing> or vice versa
    // sorted means binary search can be utilized

    // we can divide the array into parts for binary search to look for target
    // search smaller
    // search bigger - using binary search

    // first is to find pivot
    int pivot = findPivot(B, 0, B.length-1);

    // If we didn't find a pivot, then
    // array is not rotated at all
    if (pivot == -1)
      return binarySearch(B, 0, B.length-1, target);

    // If we found a pivot, then first
    // compare with pivot and then
    // search in two subarrays around pivot

    if (B[pivot] == target)
      return pivot;

    if (B[0] <= target)
      return binarySearch(B, 0, pivot-1, target);

    return binarySearch(B, pivot+1,B.length-1, target);


}

  public  static int findPivot (int[] arr, int low, int high) {

    // base cases
    if (high < low)
      return -1;

    if (high == low)
      return low;

            /* low + (high - low)/2; */
    int mid = (low + high)/2;

    if (mid < high && arr[mid] > arr[mid + 1])
      return mid;

    if (mid > low && arr[mid] < arr[mid - 1])
      return (mid-1);

    if (arr[low] >= arr[mid])
      return findPivot(arr, low, mid-1);

    return findPivot(arr, mid + 1, high);

  }

  public static int binarySearch (int[] arr, int low, int high, int key) {

    if (high < low)
      return -1;

           /* low + (high - low)/2; */
    int mid = (low + high)/2;

    if (key == arr[mid])
      return mid;

    if (key > arr[mid])
      return binarySearch(arr, (mid + 1), high, key);

    return binarySearch(arr, low, (mid -1), key);

  }

  static List <List<Integer>> twoSum(int[] num, int target) {

    // two for loops is possible but not efficient taking O to n*square
    // Using Map to store difference is better
    // iterate through the array
    // use Map technique here for 2 SUM
    // put the difference of target - number at current Index in Map and also index as value
    // 8 - 7 = 1 - put in map
    // now you are at 1, is 1 exists in Map, yes, this is our index
    // continue to iterate to find another one.. if number exists and indices differ, then we hve got a duplicate
    // ignore the dup and continue - as given in problem, don't worry about dup
    List<List<Integer>> twoSumList = new ArrayList<>();
    Map<Integer, Integer> indexMap = new HashMap<>();
    int diff = 0;

    for (int i=0; i < num.length; i++) {

      diff = target - num[i];

      if (!indexMap.containsKey(num[i])) {
        indexMap.put ( diff, i );
      } else {
        // add it to list
        List<Integer> list = new ArrayList<>();
        list.add(i);
        list.add(indexMap.get(num[i]));
        twoSumList.add(list);
      }
    }
    if (twoSumList.size() == 0 || twoSumList.isEmpty()) {
      List<Integer> list1 = new ArrayList<>();
      list1.add(-1);
      twoSumList = new ArrayList<>();
      twoSumList.add(list1);
    }
    return twoSumList;
  }

  public static void main (String[] args) {

    //System.out.println ("Calling method isPerfect " + isPerfectSquare(144));

    distinctValues();
    Test test = new Test();
    System.out.println (test.toString());



  }

  static boolean isPerfectSquare(int N)
  {
    for(int i=0; i*i <= N; i++) {
      System.out.println ("i " + i);
      if (i * i == N) {
        return true;
      }
    }
    return false;
  }


  static void distinctValues() {

    int[] ch = new int[] { 1,1,2,2,4,4,7,7,7,10,10,9};

    int sum =1;
    for (int i = 0; i< ch.length; i++) {

      sum = sum ^ ch[i];

    }

    System.out.println ("sum "  + sum);

  }


}


