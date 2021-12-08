package ss2_loop.bai_tap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.println("Enter your choice by number: ");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Print the rectangle");
                for (int i = 1; i <= 3; i++){
                    for (int j = 1; j <= 7; j++){
                        System.out.print(" * ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("Print the square triangle");
                for (int i = 1; i <= 5; i++){
                    for (int j = 1; j <= 5; j++){
                        if(j <= i)
                            System.out.print(" * ");
                    }
                    System.out.println();
                }
                break;
            case 3:
                System.out.println("Print isosceles triangle");
                for (int i = 7; i >= 1; i--){
                    for (int j = 1; j <= i; j++){
                        System.out.print(" * ");
                    }
                    System.out.println();
                }
                break;
            case 4:
                System.exit(4);
            default:
                System.out.println("No choice!");
        }
    }
}
