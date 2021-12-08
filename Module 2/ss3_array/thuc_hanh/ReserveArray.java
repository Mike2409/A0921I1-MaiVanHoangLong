package ss3_array.thuc_hanh;

import java.util.Scanner;

public class ReserveArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // tạo điều kiện nhập mảng không quá 20 phần tử
        int n;
        do {
            System.out.print("Enter a size:");
            n = scanner.nextInt();
            if (n > 20)
                System.out.println("Size does not exceed 20");
        } while (n > 20);

        //nhập vào giá trị các phần tử
        int[] array = new int[n];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }

        //in ra mảng đã nhập
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        //đảo ngược mảng
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[n - 1 - j];
            array[n - 1 - j] = temp;
        }

        //in ra mảng đảo ngược
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

    }
}
