//package com.franc;

public class Main {

    public static void main(String[] args) {
        try {
            int sum = sum(10, 20);
            int multy = multy(5, 5);
            int subt = subt(50, 100);
            int div = div(10, 0);
            double covert = convert(150.25);
            double percent = percent(100.25);
            print("super");
            System.out.println(sum + " " + multy + " " + subt + " " + div + " " + covert + " " + percent);
        } catch (ArithmeticException err) {
            System.out.println("Ошибка");
        } finally {
            System.out.println("KUKU");
        }
    }

    private static int sum(int num1, int num2) {
        return num1 + num2;
    }

    private static int multy(int num1, int num2) {
        return num1 * num2;
    }

    private static int subt(int num1, int num2) {
        return num2 - num1;
    }

    private static int div(int num1, int num2) {
        return num1 / num2;
    }

    private static double convert(double euro) {
        double stav = 0.75;
        return euro * stav;
    }

    private static double percent(double base) {
        double stav = 10;
        return base + base / 100 * stav;
    }

    private static void print(String str) {
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);
    }


}
