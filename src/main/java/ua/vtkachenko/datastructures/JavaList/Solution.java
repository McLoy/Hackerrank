package ua.vtkachenko.datastructures.JavaList;
/*
INPUT
5
12 0 1 78 12
2
Insert
5 23
Delete
0
 */
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        String pull = scan.nextLine();
        String arr = scan.nextLine();
        String[] arrStr = arr.split(" ");
        List<String> arString = new ArrayList<>();
        for (String s :arrStr) {
            arString.add(s);
        }
        int xQueries = scan.nextInt();
        while(xQueries > 0){
            String command = scan.next();
            if(command.equals("Insert")){
                int pos = scan.nextInt();
                int value = scan.nextInt();
                arString.add(pos, String.valueOf(value));
            }
            if(command.equals("Delete")){
                int pos = scan.nextInt();
                arString.remove(pos);
            }
            xQueries--;
        }
        scan.close();
        for (String s :arString) {
            System.out.print(s + " ");
        }
    }
}