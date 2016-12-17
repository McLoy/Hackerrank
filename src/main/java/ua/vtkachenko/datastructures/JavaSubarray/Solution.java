package ua.vtkachenko.datastructures.JavaSubarray;

import java.util.Scanner;

/*
Sample Input

5
1 -2 4 -5 1

 */
public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int negative = 0;
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = scan.nextInt();
        }

        int sum;
        int length = arr.length;

        for (int k = 0; k < length; k++) {
            for (int i = 0; i < length - k; i++) {
                sum = 0;
                for (int j = 0; j < k + 1; j++) {
                    sum = sum + arr[i + j];
                }
                if (sum < 0) negative++;
            }
        }
        System.out.println(negative);
    }
}