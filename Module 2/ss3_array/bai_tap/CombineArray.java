package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class CombineArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int[] array3 = new int[array1.length+array2.length];
        System.out.println("Nhập phần tử array1: ");
        for (int i = 0; i< array1.length;i++) {
            System.out.println("Phần từ thứ "+(i+1)+" : ");
            array1[i]=scanner.nextInt();
        }
        System.out.println("Nhập phần tử array2: ");
        for (int i = 0; i< array2.length;i++) {
            System.out.println("Phần từ thứ "+(i+1)+" : ");
            array2[i]=scanner.nextInt();
        }

        for (int i = 0; i< array1.length;i++) {
            array3[i]=array1[i];
        }
        for (int i = 0; i< array2.length;i++) {
            array3[array1.length + i]=array2[i];
        }
        System.out.println("Mảng sau khi gộp Array3: "+ Arrays.toString(array3));

    }
}
