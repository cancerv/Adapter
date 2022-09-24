package com.company;

public class Main {

    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        System.out.println("1 + 2 = " + calc.sum(1, 2));
        System.out.println("3 * 2 = " + calc.mult(3, 2));
        System.out.println("2 ^ 2 = " + calc.pow(2, 2));
    }
}
