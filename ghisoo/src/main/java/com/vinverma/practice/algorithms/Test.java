package com.vinverma.practice.algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Test {

  public static void mMAINIINNain(String[] args) {



    System.out.println("total number of words in string");

    String s = "as happy     bhai cham   ";
    //         012345678910
    //                     11121314
    // when you find non space and previous is space, increment count
    // when index is 0 and current is non space, increment count
    // when index is end and it's non space, increment count

    char[] ch = s.toCharArray();
    int wordCount = 0;

    if (s == null || s.isEmpty()) {
      System.out.println("0 words");
      return;
    }

    for (int i = 0; i < ch.length; i++) {

      if (i > 0 && ch[i] != ' ' && ch[i - 1] == ' ') {

        wordCount++;
        System.out.println("i : " + i +
            " ch[i]  " + ch[i] +
            "   wordCount : " + wordCount);

      } else if (i == 0 && ch[i] != ' ') {

        wordCount++;
        System.out.println("i : " + i +
            " ch[i]  " + ch[i] +
            "   wordCount : " + wordCount);

      }

    }

    System.out.println("Word count is = " + wordCount);
  }

  public static void main (String[] args) {


    String jsonObject  = "SPONSOREDGUEST";
    if(jsonObject.matches(".*SPONSOR.*") || (jsonObject.matches(".*sposnor.*"))){
      System.out.println ("true");
    } else {
      System.out.println ("false");
    }

      //testEnc();
  }

  @org.testng.annotations.Test
  public void testReverse() {

    //How to reverse String in Java without using API methods?
    String s = " I  GOT LUCKY ";
    // output = "GFE DCBA";
    String s2 = "";
    char[] ch = s.toCharArray();

    System.out.println("before " + Arrays.toString(ch));

    // convert string to character aray
    // start from length of this array until 0
    // append to s2 - target string

    // how do we do in place
    // we can swap
    // int i =0;
    // int j = s.length();
    // j-i;
    int i = s.length() - 1;
    int j = 0;

    while (i >= 0) {
      ch[i] = ch[j];
      i--;
      j++;
    }
    System.out.println("after " + Arrays.toString(ch));

    String s3 = revertWithRecursion(s);
    System.out.println(" recursion [" + s3 + "]");

  }

@org.testng.annotations.Test
public void reverseHalf() {

    String s = "ABC  DEF";
    char[] ch = s.toCharArray();

    System.out.println("before " + Arrays.toString(ch));

    for (int i = 0; i < ch.length / 2; i++) {

      char ch1 = ch[i];
      ch[i] = ch[ch.length - 1 - i];
      ch[ch.length - 1 - i] = ch1;

      System.out.println("i " + i + " ch[i] " + ch[i] + " ch[end] " + ch[ch.length - 1 - i]);

    }

    System.out.println("after " + Arrays.toString(ch));

  }
  // abc def
  // f abc de
  // f + e + abc d

  @org.testng.annotations.Test
  public void testPrint100() {

    print100WithoutLoop(1);

  }

  int print100WithoutLoop(int i) {

    if (i == 100) {
      System.out.println(i);
      return 100;
    }

    System.out.println(i);

    return print100WithoutLoop(++i);

  }

  String revertWithRecursion(String s) {

    if (s.length() == 0) {
      return "";
    }

    return s.charAt(s.length() - 1) + revertWithRecursion(s.substring(0, s.length() - 1));
  }

  void WordsWithoutSpaces(String s) {

    // convert to character array
    // iterate from the end to start
    // if current character is end
    // if current character ! not space
    // start
    // continue
    // else while current char not space
    // count++
    // end
    // print end to start from string using substring OR stoer them somewhere

    // if current index is not length
    // continue until find non space
    // start
    // if found space
    // end
    // print start to end

    // if current character is ch[0] is not space
    // end

    char[] ch = s.toCharArray();
    int start = 0;
    int end = 0;

    for (int i = ch.length - 1; i >= 0; i--) {

      if (i == ch.length - 1 && ch[i] != ' ') {

        start = ch.length - 1;

      }

      if (start != 0 && ch[i] == ' ') {

        end = i - 1;

        System.out.println(s.charAt(end));
      }


    }


  }

  //Read more: http://javarevisited.blogspot.com/2015/02/how-to-count-number-of-words-in-string.html#ixzz4oihtIlCD

  public void main2(String[] args) {

    if (true)
      return;

    Test tester = new Test();
    tester.testBinarySearch();

    if (true)
      return;

    int[] arr = {2, 3, 4, 5, 6};
    System.out.println("Original array");
    printArray(arr);

    int[] inarr = {1, 2, 3, 4};
    printArray(inarr);
    int[] product = product(inarr);
    printArray(product);
    //optimizedRotationArray (arr, 5);
    //rotateArray();

    if (true)
      return;

    checkFlex();

    String dup = findDupChars("ABCDDEEFGHI");
    System.out.println("dup=>" + dup);

    //mapTest();
    String s1 = "selfreg,sponsored";
    matchMe(s1);

    s1 = " sponsored, selfreg";
    matchMe(s1);

    s1 = "sponsored, selfreg ";
    matchMe(s1);

    s1 = "self-reg,sponsored,selfreg";
    matchMe(s1);

    s1 = "selfreg ,sponsored";
    matchMe(s1);

    s1 = "selfreg";
    matchMe(s1);

    s1 = "sponsored";
    matchMe(s1);


  }

  static boolean matchMe(String s1) {
    if ((s1.matches("(.*)selfreg(.*)sponsored(.*)") || s1.matches(".*sponsored.*selfreg.*"))) {
      System.out.println(s1 + ": Found the match");
      return true;
    }
    System.out.println(s1 + ": not matched");
    return false;
  }

  public static void mapTest() {

    AclDetailItem[] items = new AclDetailItem[3];

    AclDetailItem item1 = new AclDetailItem();
    item1.setAclName("acl1");
    item1.setVlanName("vlan1");
    item1.setWlanName("wlan1");

    AclDetailItem item2 = new AclDetailItem();
    item2.setAclName("acl2");
    item2.setVlanName("vlan2");
    item2.setWlanName("wlan2");

    AclDetailItem item3 = new AclDetailItem();
    item3.setAclName("acl3");
    item3.setVlanName("vlan3");
    item3.setWlanName("wlan3");

    items[0] = item1;
    items[1] = item2;
    items[2] = item3;

    System.out.println("Before " + items.length);

        /*List<main.AclDetailItem> filteredAclList = new ArrayList<main.AclDetailItem>();
        for (main.AclDetailItem acl: items) {
            if (!acl.getAclName().contains("acl1")) {
                filteredAclList.add(acl);
            }
        }*/

    //items = Arrays.stream(items).filter(x -> !x.getAclName().equalsIgnoreCase("acl1")).toArray(main.AclDetailItem[]::new);
    //items = Arrays.stream(items).filter(x -> !x.getAclName().equalsIgnoreCase("acl2")).toArray(main.AclDetailItem[]::new);

        /*items = Arrays.stream(items).filter(
                x ->!x.getAclName().equalsIgnoreCase("acl1")
                        || !x.getAclName().equalsIgnoreCase("acl2"))
                .toArray(main.AclDetailItem[]::new);*/

    items = Arrays.stream(items).filter(
        x -> !x.getAclName().matches("(?i)^acl[1|2]$"))
        .toArray(AclDetailItem[]::new);

    //!x.getAclName().matches("(?i)^acl[1|2]$")

    //a = Arrays.stream(a).filter(s -> !s.isEmpty()).toArray(String[]::new);

    //main.AclDetailItem[] finalACL = (main.AclDetailItem[]) filteredAclList.toArray();

    System.out.println("After " + items.length);
  }

  //Find dup chars in string
  static String findDupChars(String s1) {

    String dupped = "";

    for (int i = 0; i <= s1.length() - 1; i++) {
      for (int j = 0; j <= s1.length() - 1; j++) {
        if (s1.charAt(i) == s1.charAt(j)) {
          dupped = dupped + s1.charAt(i);
        }
      }
    }
    return dupped;
  }

  static void checkFlex() {

    String s1 = "KJHKHFlexconnectlsajdsldjConfigurationFailed";
    boolean isMatched = s1.matches(".*Flexconnect.*Failed.*");
    System.out.println("Matched " + isMatched);
  }

  @org.testng.annotations.Test
  public void missingNum() {

    //int arr[] = {12, 13, 1, 10, 34, 2,3};

    //int[] arr = {1,2};

    int[] arr = {1};

    //int[] arr = null;

    //Output: The smallest element is 1 and
    //second Smallest element is 10

    if (arr == null || (arr != null && arr.length == 0)) {
      System.err.println("Invalid input");
      return;
    }

    if (arr != null && arr.length == 1) {
      System.out.println(arr[0]);
      return;
    }

    int smallest = arr[0];
    int secondSmallest = arr[1];

    for (int i = 2; i < arr.length; i++) {

      if (arr[i] < smallest) {
        smallest = arr[i];
      }
      if (arr[i] < secondSmallest && arr[i] > smallest) {
        secondSmallest = arr[i];
      }
    }

    System.out.println("smallest " + smallest + " second smallest " + secondSmallest);
  }


  static void rotateArray() {

    int[] originalArray = {2, 3, 4, 5, 6};
    int numOfRotations = 2;
    int[] finalArray = new int[originalArray.length];

    //System.out.println (" === Before ====");
    //printArray (originalArray);

       /*

       0 1 2 3  4
       2 3 4 5  6

         2 3 4  5
       6

        6 2 3 4 5

           6 2 3 4
        5

        */

    int j = 0, last = 0;
    //int i = originalArray.length-1;
    while (j < numOfRotations) {

      //i = originalArray.length-1;
      int tmp = originalArray[originalArray.length - 1];
      System.out.println("Last=>" + tmp);

      for (int i = originalArray.length - 1; i > 0; i--) {
        System.out.println("\ni [" + i + "]");
        originalArray[i] = originalArray[i - 1];
        printArray(originalArray);
      }
      originalArray[0] = tmp;
      j++;
      printArray(originalArray);
    }

    System.out.println(" === After ====");
    printArray(originalArray);

  }

  static void printArray(int[] arr) {
    for (int i = 0; i <= arr.length - 1; i++) {
      System.out.print(arr[i] + ",");
    }
    System.out.println("\n====");
  }

  static void optimizedRotationArray(int[] arr, int numOfRotations) {

    numOfRotations = numOfRotations % arr.length;

    arr = reverse(arr, 0, numOfRotations - 1);
    System.out.println("== after reversing first half === ");
    printArray(arr);

    arr = reverse(arr, numOfRotations, arr.length - 1);
    System.out.println("== after reversing second half === ");
    printArray(arr);

    arr = reverse(arr, 0, arr.length - 1);
    System.out.println("== after reversing final === ");
    printArray(arr);

  }

  static int[] reverse(int[] arr, int start, int end) {

    while (start < end) {
      int tmp = arr[end];
      arr[end] = arr[start];
      arr[start] = tmp;
      start++;
      end--;
    }
    return arr;
  }

  static int[] product(int[] arr) {
    //1,2,3,4   return [24,
    // 1,2,3, 4
    int[] arrFinal = new int[arr.length];

    for (int i = 0; i < arr.length - 1; i++) {
      int result = 1;
      for (int j = 0; j <= arr.length - 1; j++) {
        if (arr[i] != arr[j]) {
          result = result * arr[j];
        }
      }
      arrFinal[i] = result;
    }
    return arrFinal;
  }

  static void optimizedProduct() {

    int[] arr = new int[]{2, 3, 4, 5};
    int[] expected = new int[]{60, 40, 30, 24};
    int[] actual = new int[arr.length];


  }

  static void testStuff() {
    String s1 = "google";

  }

  // binary search a2 in a1
/*
    mid = hig + low / 2 = 1 / = .5 1

        0  1  2    3  4   5  6
        5  6  7   8   9  10  17

        find (10)
        low = 0
        high = 5
        mid = 6 + 0 /2 =  3

        mid = 8
        8 < 10 ; yes
       low = mid +1 ; 4
       mid = 10 / 2 = 5
       found YES

    mid = high - low / 2 = 6 - 4 / 2 =  1
        0 + (6-0) / 2 = 3
        3 6 = 3 + 6-3 / 2 = 2.5 += 3
*/

  int numFind;

  int binarySearch(int a[], int low, int high) {

    int mid = low + high / 2;
    if (numFind == mid && low < high) {
      return mid;
    } else if (low > high) {
      return -1;
    }
    if (a[mid] < numFind) {
      low = mid + 1;
    } else {
      high = mid - 1;
    }
    return binarySearch(a, low, high);
  }

  void testBinarySearch() {

    int[] ar = new int[]{5, 6, 7, 8, 9, 10, 17};
    int found = binarySearch(ar, 0, ar.length - 1);
    if (found == -1) {
      System.out.print("Screwed!!");
    } else {
      System.out.print("Aced it!!");
    }
  }

  @org.testng.annotations.Test
  public void testMinDeleteInsert() {

    String s1 = "heap";
    String s2 = "pea";

    String s3 = "abcd";
    String s4 = "cd";

    minDeleteInsert(s3, s4);

  }
  // h e a p
  //   p e a

  // heap
  // hep

  // hep
  // heap

  public void minDeleteInsert(String s1, String s2) {

    // compare each character

    // if s1 has it, s2 does have it at that location,
    // delete s1 char, - count++
    // //add s2's char - count++
    // if it matches, do nothing
    // if s1 has it and it exceeds s2, remove from s1 - count++

    char[] c1 = s1.toCharArray();
    char[] c2 = s2.toCharArray();
    int count = 0;

    if (c1.length < c2.length) {
      System.err.println("invalid input.. ");
      return;
    }

    int k = 0;

    for (k = 0; k < c2.length; k++) {

      if (c1[k] != c2[k]) {

        System.out.println("Delete " + c1[k]);
        System.out.println("Insert " + c2[k]);
        count += 2;
      }
    }

    if (k < c1.length) {
      while (k < c1.length) {
        System.out.println("Delete " + c1[k]);
        count++;
        k++;
      }
    }

    System.out.println("Totl Del+Insert : " + count);

  }

  @org.testng.annotations.Test
  public void testPair() {

    pairTwoElements();
  }

  /*

  1 + 9 = 10
  2 + 8 = 10
  4 + 6 = 10
  3 + 7 = 10
  6 + 4 = 10

   */

  void pairTwoElements() {

    int[] n = {1, 2, 4, 3, 6};
    int x = 10;

    Map<Integer, Integer> m = new HashMap<>();

    for (int i = 0; i < n.length; i++) {

      int diff = x - n[i];
      if (m.containsKey(n[i])) {
        System.out.println("Pair " + diff + " : " + n[i]);
        // n[i]
      } else {
        m.put(diff, n[i]);
      }
    }
    System.out.println("map " + m);
  }


  public void removeOdd() {

    int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16};

    // iterate all and check whatever % 2 !=0 is odd
    // is 9 odd? Yes but it's not prime
  }

  @org.testng.annotations.Test
  public void testAngry() {

    angryProf(5, 3);

  }
  /*

  Short Problem Definition:

   The professor is conducting a course on Discrete Mathematics to a class of N students.
    He is angry at the lack of their discipline, and he decides to cancel the class
    if there are less than K students present after the class starts.

    Given the arrival time of each student,
    your task is to find out if the class gets cancelled or not.

    count student and note their time
    while (t[i] < cut_off) {
      a[i] - t
      count++;
     }

     if (count > K) {
          good;
     } else {
          bad;
     }


   */
  public void angryProf(int N, int K) {

    int[] t = new int[N];
    int start_time = 8;

    int k=0;
    for (int j = 1;j<N;j++) {
      t[k++] = j;
    }

    for(int i = 0;i < N-1;i++) {

      System.out.println ("time: " + t[i] + " student: " + i);

      if (t[i] < start_time && i < K ) {
        System.out.println ("Student: " + i  + " came in at time: " + t[i]);
      } else {
        System.err.println ("Class cancelled. Students IN: " + i + " Requirements: " + K);
        break;
      }

    }
  }


  // for a given index, check if left array is equal to right array
  // algo
  /*
      if elem less than 2, error out

      if elem are greater-equal than 3
      starting with 2nd index
      pass beginIndex and endIndex to calcSum() twice
      sum it and see if they are equal


   */

  @org.testng.annotations.Test
  public void testLeftRightSum () {

    int[] a1 = {10,10,7,3};
    int[] a2 = {4,6,5,15,3,5,4,2,1};
    int[] a3= {1,1};

    System.out.println ("Sum " + sumMe(a3));
  }

  int sumMe(int[] a) {

    if (a.length <= 2) {
      System.err.println ("Invalid Array");
      return -1;
    }

    for (int i=1; i<a.length; i++) {

      int sum1=0;
      int sum2 = 0;

      sum1 = calcSum(0, i, a);
      sum2 = calcSum(i+1, a.length, a);

      System.out.println ("sum1 " + sum1 + " sum2 " + sum2);

      if (sum1 == sum2) {
        System.out.println ("Found the number: " + i + " a[i] " + a[i]);
        return a[i];
      }

    }
    return -1;
  }

  private int calcSum (int beginIndex, int endIndex, int[] a) {

    int sum = 0;
    for (int i=beginIndex; i<endIndex; i++) {
        sum = sum + a[i];
    }
    System.out.println ("calcSum begin: " + beginIndex + " end " + endIndex + " sum] " + sum );
    return sum;
  }

  /*
  Julius Caesar protected his confidential information from his
  enemies by encrypting it.
  Caesar rotated every alphabet in the string
  by a fixed number K.
  This made the string unreadable by the enemy.
  You are given a string S and the number K.
  Encrypt the string and print the encrypted string.


  iterate through each element, get number for it and add K to it
  logic of K
  if number < Max number of Upper Case or Lower Case, it is good
  Else, it gets rolled over and starts from 0

   */


  // upper case >65 <90

  // lower case > 97 and < 122


  //@org.junit.main.Test
  public static void testEnc () {

    System.out.println("Enter length: ");
    Scanner scanner = new Scanner(System.in);
    String username = scanner.nextLine();
    System.out.println("length : " + username);

    System.out.println("Enter string: ");
    String encString = scanner.nextLine();
    System.out.println("encrypted string: " + username);

    System.out.println("Enter Offset: ");
    int offset = scanner.nextInt();
    System.out.println("offset: " + offset);

    String s = enc2(encString.toCharArray(),offset);
    System.out.println("Encrypted String: " + s);


    //for (int x = 65; x <91; x++) {
    //  System.out.print ( (char) x + " " );
    //}

    //char[] c= {'A', 'C', 'D', 'E'};
    //encryptCeaser(c, 100);

  }

  public static String encryptCeaser (char[] a, int k) {

    int upperDiff = 90 - 65;
    int lowerDiff = 122 - 97;

    StringBuilder sb = new StringBuilder();

    System.out.println ("UnEncrypted String " + new String(a));

    int delta = 0;
    for (int i=0; i < a.length; i++) {

      // check if in range of 65 - 90
      // yes good
      // no

      if (Character.isAlphabetic((int) a[i])) {
        if (Character.isUpperCase(a[i])) {
          delta = (int) a[i] + k;
          System.out.println("curr_char " + (char) a[i] + " int delta " + delta);

          if (delta > 90) {

            while (delta > upperDiff) {
              delta = delta - upperDiff;
              System.out.println("In while delta " + delta);
            }
            if (delta < upperDiff) {
              delta = upperDiff - delta;
              delta = delta + 65;
              System.out.println("int delta down " + delta);
            }

            System.out.println("char delta " + (char) delta);
            sb.append((char) delta);

          } else {
            sb.append((char) (k + (int) a[i]));
          }
        } else {

          delta = (int) a[i] + k;
          System.out.println("curr_char " + (char) a[i] + " int delta " + delta + " char delta " + (char) delta);

          if (delta > 122) {

            while (delta > 122) {
              delta = delta - 122;
            }

            if (delta < lowerDiff) {
              delta = lowerDiff - delta;
              delta = delta + 97;
              System.out.println("lower case delta down " + delta);
            }

            System.out.println("lower case char delta " + (char) delta);
            sb.append((char) delta);

          } else {
            sb.append((char) (k + (int) a[i]));
          }
        }

      } else {

        sb.append(a[i]);
      }

    }
    System.out.println ("Encrypted String " + sb.toString());
    return sb.toString();
  }


  public static String enc2 (char[] a, int k) {

    int delta = 0;
    StringBuilder sb = new StringBuilder();

    k = k % 26;

    for (int i = 0; i < a.length; i++) {

      if ( Character.isUpperCase (a[i]) ) {

            delta = (int) a[i] + k;

            if (delta < 90) {
              sb.append((char) ((int) a[i] + k));
            } else if (delta > 90) {
                  delta = delta - 90;
                  delta = 65 + delta - 1;
                  sb.append( (char) delta);
            } else {
                sb.append( (char) delta);
             }
          }

      else if( Character.isLowerCase (a[i]) ) {


        delta = (int) a[i] + k;
            if (delta < 122)
              sb.append((char) ((int) a[i] + k));
            else if (delta > 122) {
                delta = delta - 122;
              delta = 97 + delta - 1;
              sb.append((char) delta);
            } else {
              sb.append((char) delta);
            }

          }  else {
              sb.append(a[i]);
          }
    }
    return sb.toString();
  }

  @org.testng.annotations.Test
  public void testMars()  {

    int count = mars ("abc");
    System.out.println (count);

  }

  public int mars( String S)  {

    if (S.length() % 3 !=0 ) {
      return 0;

    }

    if (S.length() > 99) {
      return 0;
    }

    if (S.isEmpty())
      return 0;

    int i = 0;
    int j,k=0;
    int count = 0;

    while (i < S.length()) {

      j = i+1;
      k = j+1;

      int a  = S.charAt(i);
      int b  = S.charAt(j);
      int c  = S.charAt(k);

      if ( !checkAlpha(a) ||  !checkAlpha(b) || ! checkAlpha(c)) {
        return 0;
      }

      if (Character.isLowerCase(S.charAt(i)) ||
          Character.isLowerCase(S.charAt(j)) ||
              Character.isLowerCase(S.charAt(k)) ) {
        return 0;
      }

      if (Character.isDigit(S.charAt(i)) ||
          Character.isDigit(S.charAt(j)) ||
          Character.isDigit(S.charAt(k)) ) {
        return 0;
      }

      if (S.charAt(i) != 'S' || S.charAt(j) != 'O' || S.charAt(k) != 'S') {
        count++;
      }

      i = i+3;

    }
    return count;
  }

  static boolean checkAlpha (int num) {

    if (num >=65 && num <=90) {
      return true;
    }
    return false;

  }

  void printFractions() {

  }

  }