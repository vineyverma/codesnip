package com.vinverma.practice.algorithms;

/**
 * Created by vinverma on 1/10/18.
 */
public class VersionComparisonLT {

    public int compareVersion(String version1, String version2) {

      if (validate (version1, version2) == 0) {
        System.err.println ("Invalid versions");
        return -100;
      }

      String[] ver1  = version1.split(".");
      String[] ver2  = version2.split(".");

      if (Integer.parseInt(ver1[0])  < Integer.parseInt(ver2[0])) {

        return -1;

      } else if (Integer.parseInt(ver1[0]) == Integer.parseInt(ver2[0])) {

        if (Integer.parseInt(ver1[1])  == Integer.parseInt(ver2[0])) {

          return 0;

        } else if (Integer.parseInt(ver1[1]) > Integer.parseInt(ver2[0])) {

          return 1;

        }
      } else {

          return 1;

      }

      return 0;

    }

    public int validate (String version1, String version2) {

      if (version1.isEmpty() || version2.isEmpty())
        return 0;

      if (version1.indexOf(".")  == -1 || version2.indexOf(".")  == -1)
        return 0;

      String[] ver1  = version1.split(".");
      String[] ver2  = version2.split(".");

      if (!ver1[0].matches ("\\d") || !ver1[1].matches ("\\d") ||
          !ver2[0].matches ("\\d") || !ver2[1].matches ("\\d")) {

        return 0;

      }

      return -1;
    }

    public static void main (String[] args) {

      VersionComparisonLT lt = new VersionComparisonLT();
      System.out.println ("1.0 vs 1.1" + lt.compareVersion("1.0", "1.1"));
      System.out.println ("1.2 vs 1.1" + lt.compareVersion("1.2", "1.2"));

    }

}
