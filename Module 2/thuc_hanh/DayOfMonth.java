package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào năm bạn muốn kiểm tra: ");
            int year = scanner.nextInt();
        System.out.println("Nhập vào tháng bạn muốn kiểm tra: ");
            int month = scanner.nextInt();

        String daysInMonth;
        switch (month) {
            case 2:
                if (year % 4 == 0){
                    System.out.println("Đây là năm nhuận. ");
                    daysInMonth = "29";
                } else{
                    System.out.println("Đây không phải là năm nhuận. ");
                    daysInMonth = "28";
                }
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = "30";
                break;
            default:
                daysInMonth = "";
                break;
        }

        if (!daysInMonth.equals("")) System.out.printf("The month '%d' has %s days!", month, daysInMonth);
        else System.out.print("Invalid input!");

    }
}
