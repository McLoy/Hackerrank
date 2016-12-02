package ua.vtkachenko.introduction.JavaStringTokens;

import java.util.*;

//He is a very very good boy, isn't he?
public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        StringTokenizer st= new StringTokenizer(s, "[ !,?._'@]+");
        System.out.println(st.countTokens());
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
        scan.close();

    }
}
