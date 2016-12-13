package ua.vtkachenko.exceptions.JavaExceptionHandling;

import java.io.*;
import java.util.*;
/*
INPUT
10
Hello
 */
public class Solution {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(scanner.nextInt() / scanner.nextInt());
        } catch (InputMismatchException ex) {
            System.out.println("java.util.InputMismatchException");
        } catch (ArithmeticException ex) {
            System.out.println(ex);
        }
    }
}
