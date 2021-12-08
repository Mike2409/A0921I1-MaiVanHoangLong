package ss2_loop.thuc_hanh;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = 1.0;
        System.out.println("Nhập vào số tiền bạn muốn đầu tư: ");
        money = scanner.nextDouble();

        int month = 1;
        System.out.println("Nhập vào số tháng bạn muốn gửi: ");
        month = scanner.nextInt();

        double interestRate = 1.0;
        System.out.println("Nhập vào lãi suất hằng năm: ");
        interestRate = scanner.nextDouble();

        double totalInterest = 0;
        for(int i = 0; i < month; i++){
            totalInterest += money * (interestRate/100)/12 * month;
        }

        System.out.println("Total of interest: " + totalInterest);
    }
}
