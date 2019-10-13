package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int y = 2;
        int x = 3;
        int t = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of m:  ");
        int m = input.nextInt();

        for (int i=3; i<=m; i++) {

            t = x + 2*y +2*i;
            y = x;
            x = t;
        }
        System.out.println("The answer to the equation: t(n)= t(n-1) + a∙t(n-2)+ b∙n (n ≥ 3), when m is " + m +" is " + t); /*Why can't I use this statement out of the for loop without initializing "t" and just by declaring it in the same class I'm using it?*/

    }
}