package ua.vtkachenko.strings.JavaStringReverse;

import java.io.*;
import java.util.*;
/*
INPUT madam
 */
public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuilder sb = new StringBuilder(A);
        String polyndrom = "Yes";
        for(int i=0; i < sb.length()/2; i++){
            if(sb.charAt(i) != sb.charAt(sb.length()-i-1)){
                polyndrom = "No";
            }
        }
        System.out.println(polyndrom);

    }
}
