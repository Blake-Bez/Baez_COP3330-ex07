/*
 *  UCF COP3330 Fall 2021 Assignment 7 Solution
 *  Copyright 2021 Blake Baez
 */
package org.example;
import java.util.Scanner;

public class App 
{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("What is the length of the room in feet? ");
            int length = input.nextInt();
            System.out.print("What is the width of the room in feet? ");
            int width = input.nextInt();
            int dimensions = length * width;
            double constant = 0.09290304;
            double m2 = dimensions * constant;

            System.out.println("you entered dimensions of " + length + " feet by " + width + " feet.");
            System.out.println("The area is \n" + dimensions + " square feet\n" + m2 + " square meters");
        }
    }