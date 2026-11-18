package com.Dsa.LC242;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String s = "Anagram";
        String t = "nAgaram";
        
        boolean result = isAnagram(s, t);
        System.out.println(result); // Output: true
    }

    // A helper method that sorts a string and returns the sorted version
    static String charSort(String st) {
        char[] chars = st.toCharArray();
        Arrays.sort(chars);
        return new String(chars); // Return the sorted string instead of printing it
    }

    // The method to check if they are anagrams
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        // Sort both strings using our helper method
        String sortedS = charSort(s);
        String sortedT = charSort(t);

        // Use .equals() to compare string contents
        return sortedS.equals(sortedT);
    }
}