package ua.vtkachenko.introduction.JavaRegex;

import java.util.Scanner;

/*
000.12.12.034
121.234.12.12
23.45.12.56
00.12.123.123123.123
122.23
Hello.IP
 */
public class Solution{

    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}
class MyRegex{
    public String pattern = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
            + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
            + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
            + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

    //String stat = "[01]?\\d\\d?|\\d\\d|1\\d\\d|2[0-5][0-5]";
    //public String pattern = "^(" + stat + "){1,3}\\.(" + stat + "){1,3}\\.(" + stat + "){1,3}\\.(" + stat + "){1,3}$";
}