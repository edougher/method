package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        menu();
        int choice = 0;
        choice = in.nextInt();
        switch1(choice);
    }

    static int menu() {
        Scanner in = new Scanner(System.in);
        System.out.println("Chose which shape you would like to find the area for.");
        System.out.println("");
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        int choice;
        choice = in.nextInt();
return(choice);


    }

    public static void switch1(int choice) {
        switch (choice) {
            case 1:
                triangle();
            case 2:
                rectangle();
            case 3:
                trapezoid();
            case 4:
                ellipse();
            default:
                System.out.println("Please try again");
        }
    }
    public static void triangle() {
        System.out.println("The area of a Triangle is .5 x Base x Height");
    }
    public static void rectangle() {
        System.out.println("The area of a Rectangle Width x Height");
    }
    public static void trapezoid() {
        System.out.println("The area of a Trapezoid is .5 (A + B) x H");
    }
    public static void ellipse() {
        System.out.println("The area of an Elipse is pi x A x B");
    }
}