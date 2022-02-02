package com.loops;

import java.util.Scanner;

public class Nines {
    public static void main(String args[]) {
        System.out.println("User input");
        Scanner scan = new Scanner(System.in);
        Integer n = scan.nextInt();
        int sum=0;

        for(int i=0;i<n;i++){
            int result=1;
            for(int j=1;j<=i;j++){
                result*=10;
            }
        sum=sum+(9*result);
            System.out.print(sum+"+");
        }

        }
    }

