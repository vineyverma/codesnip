package com.vinverma.practice.algorithms;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FromJayPrakash {

  public static List<Integer> commonValues(int[] array1, int[] array2)
  {
    List<Integer> resList = new ArrayList<Integer>();
    Arrays.sort(array1);
    Arrays.sort(array2);

//Index for second array
    int arr2CurrentIndex = 0;

    for(int i = 0; i < array1.length; i++)
    {
      for(int j = arr2CurrentIndex; j < array2.length; j++)
      {
        if(array1[i] == array2[j])
        {
          resList.add(array2[j]);

//Sort the index of second array, so that look up of next value in first array can start from this index in second array, as the array is sorted.
          arr2CurrentIndex = j++;
          break;
        }

      }

    }

    return resList;
  }
  public static void main(String[] args) {

    int[] array1 = {10,20,30,40};
    int[] array2 = {30,20,10,80};
    List<Integer> commonValues = FromJayPrakash.commonValues(array1, array2);
    System.out.println(commonValues);
  }

}

//####################