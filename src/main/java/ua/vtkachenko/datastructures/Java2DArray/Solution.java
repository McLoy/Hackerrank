package ua.vtkachenko.datastructures.Java2DArray;

import java.util.Scanner;

/*
Input (stdin)

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 9 2 -4 -4 0
0 0 0 -2 0 0
0 0 -1 -2 -4 0

 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int result = Integer.MIN_VALUE;
        int summ = 0;
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
                if(i>1 && j >1){
                    summ = arr[i][j] + arr[i][j-1] + arr[i][j-2]
                            + arr[i-1][j-1]
                            + arr[i-2][j] + arr[i-2][j-1] + arr[i-2][j-2];
                    if (summ > result){
                        result = summ;
                    }
                }
            }
        }
        System.out.println(result);
    }
}


