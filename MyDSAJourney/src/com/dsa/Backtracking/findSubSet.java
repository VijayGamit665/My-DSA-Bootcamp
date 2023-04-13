package com.dsa.Backtracking;

public class findSubSet {

    public static void main(String[] args) {

        String str = "abc";
        findSubsets1(str, "", 0);

    }

    public static void findSubsets1(String str, String ans, int i) {

        //base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("Null");
            } else {
                System.out.println(ans);
            }
            return;
        }

        //yes choice
        findSubsets1(str, ans + str.charAt(i), i + 1);

        // No Choice
        findSubsets1(str, ans, i + 1);
    }


}
