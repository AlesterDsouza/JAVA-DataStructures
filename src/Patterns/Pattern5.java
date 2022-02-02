package Patterns;

import java.io.*;

public class Pattern5 {
        public static void printNums(int n)
        {
            int i, j, num=1;
            for(i=0; i<n; i++)
            {
                for(j=0; j<=i; j++) {
                    if (num % 2 != 0) {
                        System.out.print("1");
                    }
                    if (num % 2 == 0) {
                        System.out.print("0");
                    }
                    num = num + 1;
                }
                System.out.println();
            }
        }


        public static void main(String args[])
        {
            int n = 5;
            printNums(n);
        }
    }

