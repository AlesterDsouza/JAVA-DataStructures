package com.loops;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String args[]) {
        Random rand = new Random();
        System.out.println("Generate Number: ");
        Integer n = rand.nextInt(50);
        System.out.println(n);
        int a;


       do
        {
            Scanner scan = new Scanner(System.in);
             a = scan.nextInt();
            if (a != n) {
                if (a > n) {
                    System.out.println("Too high, try again");
                } else if (a < n) {
                    System.out.println("Too low, try again");
                }


            } else {
                System.out.println("Found");
            }

        }while(a>=n || a<=n );
    }
}


