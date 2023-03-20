package com.dsa.Strings;

public class SubStrings {
    public static void main(String[] args) {
        // subStings
        String str = "HelloWorld";
        System.out.println(subStings(str, 0, 5));

    }

    public static String subStings(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }
}
