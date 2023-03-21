package com.dsa.Strings;

import java.util.*;
import java.util.Arrays;
import java.util.Scanner;

public class PracticeString {

    public static void main(String[] args) {
        //Solution 1: Count how many times lowercase vowels occurred in a String entered by the user
        String apna = new Scanner(System.in).next();
        int count = 0;

        for (int i = 0; i < apna.length(); i++) {
            char ch = apna.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("count vowels is :" + count);

        //Question 2:  What will be the output of the followingcode?
        String str = "VijayGamit";
        String str1 = "Surat";
        String str2 = "VijayGamit";
        System.out.println(str.equals(str1) + " " + str.equals(str2));

        //Question 3 : What will be the output of the followingcode?

        String str3 = "ApnaCollege".replace("2", "");
        System.out.println(str3);

        //Question 4 : Determine if 2 Strings are anagrams of each other.

        String ana0 = "Race";
        String ana1 = "Care";

        ana0 = ana0.toLowerCase();
        ana1 = ana1.toLowerCase();
        // check if length is same
        if (ana0.length() == ana1.length()) {
            //convert strings to char array
            char[] chararrays1 = ana0.toCharArray();
            char[] chararrays2 = ana1.toCharArray();

            // sort the char array
            Arrays.sort(chararrays1);
            Arrays.sort(chararrays2);

            // if sorted char arrays are same
            // then the string is anagram
            boolean result = Arrays.equals(chararrays1, chararrays2);
            if (result) {
                System.out.println(ana0 + " " + ana1 + "are anagram");
            } else {
                System.out.println(ana0 + " " + ana1 + "are not anagram");
            }
        } else {

            System.out.println(ana0 + " " + ana1 + " are not anagram");
        }

    }

}
