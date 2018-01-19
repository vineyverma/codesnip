package com.vinverma.practice.algorithms;

/**
 * Created by vinverma on 11/20/17.
 */
public class RevWords {

  public static void main (String[] args) {

    String s = "the sky is blue star";

    System.out.println (reverseCarlos(s));
    reverseVV(s);
    String result = "";
    char[] ch = s.toCharArray();

    boolean isAddSpace = false;
    int prevSpaceIndex = 0;
    int currentSpaceIndex = 0;

    /*

      go from 0 until end
      current index is space
      start = 0
      subString 0 to current Index
      if existing string has something in it
      insert string at beginning

     */


  }

  public static String reverseCarlos(String str) {
    StringBuilder sb = new StringBuilder();
    int limit = str.length();
    //from last to first
    for (int i = limit - 1; i > 0; i--) {
      if (str.charAt(i) == ' ') {
        sb.append(str.substring(i + 1, limit)).append(' ');
        limit = i;
      }
    }
    sb.append(str.substring(0, limit));

    return sb.toString();
  }

  public static void reverseVV (String s) {

    char[] ch1 = s.toCharArray();
    String result = "";
    int end = ch1.length;
    int start = 0;
    for (int i=end-1; i>=0; i--) {
      if (ch1[i] == ' ') {
          start = i + 1;
          result = result + s.substring(start, end) + " ";
          end = i;
      }
    }
    result = result + s.substring(0, end);
    System.out.println ("Result:'" + result + "'");
  }

  public static String rev(String s)
  {
    String out="";
    if(s==null)
      return "";

    for(int i=s.length()-1;i>0;i--)
    {
      if(Character.isWhitespace(s.charAt(i)))
      {
        out+=s.substring(i+1)+" ";
        //s =	s.substring(0, i);
      }
    }
    return out;
  }

  public void reverseWords(char[] s) {
    int i=0;
    for(int j=0; j<s.length; j++){
      if(s[j]==' '){
        reverse(s, i, j-1);
        i=j+1;
      }
    }
    reverse(s, i, s.length-1);
    reverse(s, 0, s.length-1);
  }

  public void reverse(char[] s, int i, int j){
    while(i<j){
      char temp = s[i];
      s[i]=s[j];
      s[j]=temp;
      i++;
      j--;
    }
  }

}
