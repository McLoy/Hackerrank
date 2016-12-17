package ua.vtkachenko.datastructures.JavaArraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfArrays = scan.nextInt();
        ArrayList[] list = new ArrayList[countOfArrays];

        for (int i = 0; i < countOfArrays; i++) {
            int d = scan.nextInt();
            list[i] = new ArrayList();
            for (int k = 0; k < d; k++) {
                list[i].add(scan.nextInt());
            }
        }

        int countQueries = scan.nextInt();
        for (int j = 0; j < countQueries; j++) {
            try {
                System.out.println(list[scan.nextInt() - 1].get(scan.nextInt() - 1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }

        scan.close();

    }
}
