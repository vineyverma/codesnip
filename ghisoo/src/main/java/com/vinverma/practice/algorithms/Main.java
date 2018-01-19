package com.vinverma.practice.algorithms;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String str1 = "68747470733a2f2f7777772e616c6c616e6973636f6f6c2e636f6d2f2e77656c6c2d6b6e6f776e2f6d75642f76312f414c4c414e2d4d4f44454c2d303037";
        StringBuilder sb1 = new StringBuilder();

        String hex1 = "68 74 74 70 73 3a 2f 2f 6d 75 64 2e 65 78 61 6d 70 6c 65 2e 63 6f 6d 2f 2e 77 65 6c 6c 2d 6b 6e 6f 77 6e 2f 6d 75 64 2f 76 31 2f 6d 75 64 66 69 6c 65";

        String hex = asciiToHex("https://somecompany.iotservice.org/.well-known/iot/v1/MYCHIP-SOMETHING-1.0");

        String mudURL = "https://mud.example.com/.well-known/mud/v1/mudfile";

        String prefix = "\u0000\u0000\u005E\u0001"; //https://mud.example.com/.well-known/mud/v1/mudfile";

        System.out.println ("PreFix length => " + prefix.length() + " URL length=>" + mudURL.length());

        System.out.println ("hex =>"  + hex + " \n\nlength=>" + hex.length());
        System.out.println ("Formatted HEX :" + formatHex(hex1));

        //convertStringToHex("https://mud.example.com/.well-known/mud/v1/mudfile");
        /*int count = 0;
        for (int i=0 ; i < str1.length(); i++) {
            count++;
            sb1.append(str1.charAt(i));
            if (count ==2 && i !=str1.length()-1) {
                sb1.append(",");
                count  = 0;
            }
        }
        System.out.println (sb1.toString());
        */
    }

    public static void convertStringToHex (String input) {

        String hex = "68 74 74 70 73 3a 2f 2f 6d 75 64 2e 65 78 61 6d 70 6c 65 2e 63 6f 6d 2f 2e 77 65 6c 6c 2d 6b 6e 6f 77 6e 2f 6d 75 64 2f 76 31 2f 6d 75 64 66 69 6c 65";

        int length = hex.length();

        System.out.println ("len => " + length);

    }

    private static String asciiToHex(String asciiStr) {

        char[] chars = asciiStr.toCharArray();
        StringBuilder hex = new StringBuilder();
        for (char ch : chars) {
            hex.append(Integer.toHexString((int) ch));
        }

        return hex.toString();
    }


    static String formatHex(String input) {

        StringBuilder sb1 = new StringBuilder();
        int count = 0;
        for (int i=0 ; i <input.length(); i++) {
            if (input.charAt(i) == ' ' ) {
                sb1.append("\\u00");
            } else if (i == 0 ) {
                sb1.append("\\u00");
                sb1.append(input.charAt(i));
            } else {
                sb1.append(input.charAt(i));
            }
        }
        return sb1.toString();
    }

}
