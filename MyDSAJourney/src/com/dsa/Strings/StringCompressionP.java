package com.dsa.Strings;

public class StringCompressionP { // Time Complex city = O(n)

    public static void main(String[] args) {
        String str = "aaabbcdd";
        System.out.println(compress(str));
        System.out.println(compress1(str));
    }

    public static String compress(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if (count > 1) {
                newStr += count.toString();
            }
        }
        return newStr;
    }

    public static StringBuilder compress1(String str) {
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newStr.append(str.charAt(i));
            if (count > 1) {
                newStr.append(count.toString());

            }
        }
        return newStr;
    }

}
