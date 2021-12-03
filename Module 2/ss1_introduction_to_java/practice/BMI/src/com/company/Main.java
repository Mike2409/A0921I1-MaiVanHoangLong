package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào cân nặng của bạn (kg): ");
        double weight = scanner.nextDouble();
        System.out.println("Nhập vào chiều cao của bạn (mét): ");
        double height = scanner.nextDouble();

        double bmi = weight / Math.pow(height, 2);

        if (bmi < 18.5){
            System.out.println("Your bmi is " + bmi + ", you are Underweight.");
        } else if (bmi <= 25) {
            System.out.println("Your bmi is " + bmi + ", you are Normal.");
        } else if (bmi <= 30){
            System.out.println("Your bmi is " + bmi + ", you are Overweight.");
        } else{
            System.out.println("Your bmi is " + bmi + ", you are Obese.");
        }
    }
}
