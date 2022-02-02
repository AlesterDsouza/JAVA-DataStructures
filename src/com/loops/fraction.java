package com.loops;

import java.util.Scanner;

public class fraction {
    public static void main(String args[]) {
        System.out.println("User input");
        Scanner scan = new Scanner(System.in);
        Integer n = scan.nextInt();
        int sum = 0;
        float result = 0;

        for (int i = 1; i <= n; i++) {
            result = ((float)1 / i);
            System.out.print(result + " +");
        }

    }
}






