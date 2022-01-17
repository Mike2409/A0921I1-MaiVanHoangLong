package ss15_exception.thuc_hanh.array_index_out_of_bounds_exception;

import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();
        System.out.println("Vui lòng nhập chỉ số của 1 phần tử:");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        try {
            System.out.println("Giá trị của phần tử số " + x + " là: " + arr[x - 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}
