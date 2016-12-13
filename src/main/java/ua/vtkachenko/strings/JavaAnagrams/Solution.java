package ua.vtkachenko.strings.JavaAnagrams;

import java.util.Arrays;
import java.util.Scanner;

/*
INPUT
anagram
margana

 */
public class Solution {

    static boolean isAnagram(String a, String b) {

        if (a.length() != b.length()) {
            return false;
        }

        String aa = a.toUpperCase();
        String bb = b.toUpperCase();

        char[] c1 = aa.toCharArray();
        char[] c2 = bb.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1, c2);

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");

    }
}
