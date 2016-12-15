package ua.vtkachenko.bignumber.JavaBigInteger;

/*
Sample Input

1234
20

 */
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger a, b, resultAddition, resultMultiply;
        a = new BigInteger(scan.next());
        b = new BigInteger(scan.next());
        resultAddition = a.add(b);
        resultMultiply = a.multiply(b);
        System.out.println(resultAddition);
        System.out.println(resultMultiply);
    }
}
