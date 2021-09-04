package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jeremy Rosales
 */
public class Area
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        Measure length = new Measure();
        Measure width = new Measure();
        int a, b, c;
        float d;

        System.out.print("What is the length of the room in feet? ");
        length.setX(input.next());
        System.out.print("What is the width of the room in feet? ");
        width.setX(input.next());

        a = Integer.parseInt(length.getX());
        b = Integer.parseInt(width.getX());

        System.out.printf("You entered dimensions of %d feet by %d feet.\n", a, b);
        System.out.println("The area is");

        c = a * b;
        System.out.printf("%d square feet\n", c);
        d = (float) (c * 0.09290304);
        System.out.printf("%.3f square meters", d);
    }
}
