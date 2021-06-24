package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Введите сумму в белорусских рублях");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        double i = 0.395;
        double dollars = number * i;
        System.out.println(dollars + " " + "долларов США");
    }
}
