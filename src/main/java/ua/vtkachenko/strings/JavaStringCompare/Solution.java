package ua.vtkachenko.strings.JavaStringCompare;
import java.io.*;
import java.util.*;
/*
welcometojava
3
 */

public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        int count = scan.nextInt();

        List<String> arr = new ArrayList<>();
        for (int i = 0; i <= S.length() - count; i++){
            arr.add(S.substring(i, i+count));
        }

        String min = "", max = "", curr;
        for (int j = 0; j < arr.size(); j++){
            curr = arr.get(j);
            if (max.compareTo(curr) < 0){
                max = curr;
            }
            if (min.compareTo(curr) > 0 || min.equals("")){
                min = curr;
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}