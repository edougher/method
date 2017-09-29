package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //int choice = 0;
        menu();
        int choice = in.nextInt();
        switch1(choice);
    }

    public static void menu() {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose which shape you would like to find the area for.");
        System.out.println("");
        System.out.println("1:  Triangle");
        System.out.println("2:  Rectangle");
        System.out.println("3:  Trapezoid");
        System.out.println("4:  Ellipse");
    }

    public static void switch1(int choice) {
        switch (choice) {
            case 1:
                triangle();
                break;
            case 2:
                rectangle();
                break;
            case 3:
                trapezoid();
                break;
            case 4:
                ellipse();
                break;
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