package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào tiền USD bạn muốn chuyển đổi: ");
        double Usd = scanner.nextFloat();

        double Vnd = Usd * 23000;

        System.out.println("Tiền VND sẽ là: " + Vnd + " VND.");
    }
}
