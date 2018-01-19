package com.vinverma.practice.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by vinverma on 11/15/17.
 */
public class Shuffle {

  public static void main (String[] args) {

    String input = "abc";
    for (int i =0; i<input.length(); i++) {
     System.out.println (vShuff(input,i));
    }

    System.out.println ("========");

    SOShuffle s = new SOShuffle();
    for (int i=0; i < input.length(); i++) {
      //s.shuffle(input);
      System.out.println(shuffler(input));
    }
  }

  private static String vShuff(String input, int currentIndex) {

    char[] ch1 = input.toCharArray();
    for (int i=0; i < ch1.length; i++) {
      Random rand = new Random();
      int index1 = rand.nextInt(input.length());
      //if (index1 != currentIndex) {
        char temp = ch1[index1];
        ch1[index1] = ch1[currentIndex];
        ch1[currentIndex] = temp;
      //}
    }
    //System.out.println (String.valueOf(ch1));
    return String.valueOf(ch1);
  }

  public static String shuffler (String text) {
    char[] characters = text.toCharArray();
    for (int i = 0; i < characters.length; i++) {
      int randomIndex = (int)(Math.random() * characters.length);
      char temp = characters[i];
      characters[i] = characters[randomIndex];
      characters[randomIndex] = temp;
    }
    return new String(characters);
  }

  static class SOShuffle {

    public void shuffle(String input){
      List<Character> characters = new ArrayList<Character>();
      for(char c:input.toCharArray()){
        characters.add(c);
      }
      StringBuilder output = new StringBuilder(input.length());
      while(characters.size()!=0){
        int randPicker = (int)(Math.random()*characters.size());
        System.out.println ("RadnomPicker =>" + randPicker);
        output.append(characters.remove(randPicker));
      }
      System.out.println(output.toString());
    }
  }

}
