package com.loops;

import java.util.Scanner;
public class sumn{
    public static void main(String[] args) {
        int evensum=0;
        int oddsum=0;
        int exponent=1;
        int sum=0;
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        Integer x = scan.nextInt();

       while(x!=0)
       {
           n=x%10;
           sum=sum+n;
           x=x/10;

       }
        System.out.println("The sum is " + " "+ sum);

    }
}

