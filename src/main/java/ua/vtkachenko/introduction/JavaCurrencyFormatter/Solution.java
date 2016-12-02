package ua.vtkachenko.introduction.JavaCurrencyFormatter;

import java.util.*;
import java.text.*;

//12324.134
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.US);
        String us = currencyFormatter.format(payment);

        currencyFormatter = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        String india = currencyFormatter.format(payment);

        currencyFormatter = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = currencyFormatter.format(payment);

        currencyFormatter = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = currencyFormatter.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
