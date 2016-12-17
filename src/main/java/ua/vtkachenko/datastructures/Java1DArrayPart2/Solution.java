package ua.vtkachenko.datastructures.Java1DArrayPart2;

import java.util.Scanner;

/*
Sample Input
4
5 3
0 0 0 0 0
6 5
0 0 0 1 1 1
6 3
0 0 1 1 1 0
3 1
0 1 0
 */
import java.util.*;

public class Solution {

    public static int[] currArray;
    public static int jump;
    public static int length;
    public static boolean[] visitedArray;
    private static boolean result = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int k = 0; k < count; k++) {

            length = sc.nextInt();
            currArray = new int[length];
            visitedArray = new boolean[length];
            Arrays.fill(visitedArray, false);
            jump = sc.nextInt();
            for (int n_i = 0; n_i < length; n_i++) {
                currArray[n_i] = sc.nextInt();
            }
            int temp = 0;
            result = false;
            isPossible(temp);
            if (result) System.out.println("YES");
            else System.out.println("NO");
        }

    }

    private static void isPossible(int i) {
        if (i > length || i + jump >= length || i == length - 1) {
            result = true;
            return;
        }
        if (visitedArray[i] == true) {
            return;
        }
        visitedArray[i] = true;
        if (i + 1 < length && currArray[i + 1] == 0) {
            isPossible(i + 1);
        }
        if (i - 1 >= 0 && currArray[i - 1] == 0) {
            isPossible(i - 1);
        }
        if (i + jump < length && currArray[i + jump] == 0) {
            isPossible(i + jump);
        }
    }
}
