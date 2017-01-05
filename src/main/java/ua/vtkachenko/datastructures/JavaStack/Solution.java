package ua.vtkachenko.datastructures.JavaStack;

import java.util.Scanner;

/*
Sample Input

{}()
({()})
{}(
[]

 */
public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            while (input.length() != (input = input.replaceAll("\\(\\)|\\[\\]|\\{\\}", "")).length()) ;
            System.out.println(input.isEmpty());

        }

    }
}
