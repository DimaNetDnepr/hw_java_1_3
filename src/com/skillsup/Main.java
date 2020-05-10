package com.skillsup;

public class Main {
    public static void main(String[] args) {

        int n = 5;
        int i;

        boolean exp = false;
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                exp = true;
                break;
            }
        }

        if (exp) {
            System.out.println(n + " - составное число");
        } else {
            System.out.println(n + " - простое число");
        }
    }
}
