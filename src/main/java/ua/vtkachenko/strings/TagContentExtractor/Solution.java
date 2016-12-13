package ua.vtkachenko.strings.TagContentExtractor;

import java.util.*;
import java.util.regex.*;

/*
4
<h1>Nayeem loves counseling</h1>
<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>
<Amee>safat codes like a ninja</amee>
<SA premium>Imtiaz has a secret crush</SA premium>
 */
public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        Pattern pattern = Pattern.compile("<(.+?)>([^<>]+)</\\1>");

        while (testCases > 0) {
            String line = in.nextLine();
            Matcher matcher = pattern.matcher(line);
            int count = 0;
            while (matcher.find()) {
                if (matcher.group(2).length() != 0) {
                    System.out.println(matcher.group(2));
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("None");
            }

            testCases--;
        }
    }
}

