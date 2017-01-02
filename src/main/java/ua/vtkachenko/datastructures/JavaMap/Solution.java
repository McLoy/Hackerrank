package ua.vtkachenko.datastructures.JavaMap;
/*
Sample Input

3
uncle sam
99912222
tom
11122222
harry
12299933
uncle sam
uncle tom
harry

 */

import java.util.*;
import java.util.regex.Pattern;

class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String nameRegex = "([a-z]+){2,}(\\s)?(([a-z]+){2,})?"; //firstName secondName
        String phoneRegex = "[1-9]([0-9]){7}"; //phone number
        Pattern namePattern = Pattern.compile(nameRegex);
        Pattern phonePattern = Pattern.compile(phoneRegex);
        Map<String, Integer> phoneBook = new HashMap<>();

        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();
            if (namePattern.matcher(name).matches() && phonePattern.matcher(String.valueOf(phone)).matches()){
                phoneBook.put(name, phone);
            }
        }
        while (n > 0) {
            String s = in.nextLine();
            if (phoneBook.containsKey(s)){
                Integer currValue = phoneBook.get(s);
                if (currValue != null) {
                    System.out.println(s + "=" + currValue);
                }
            } else {
                System.out.println("Not found");
            }
            n--;
        }
        in.close();

    }
}

