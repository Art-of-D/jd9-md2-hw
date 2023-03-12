package org.mycalc;

import input.GetUserNumber;
import mycalculator.SumCalculator;

public class Main {
    public static void main(String[] args) {
        System.out.println(new SumCalculator().sum(new GetUserNumber().getInteger()));

    }
}