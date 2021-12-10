package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementInArray {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] array = {1, 2, 3, 4, 5, 0, 0, 0, 0, 0};
            System.out.println("Nhập số bạn muốn chèn vào mảng");
            int element = scanner.nextInt();
            int index;
            do {
                System.out.println("Nhập vị trí bạn muốn chèn");
                index = scanner.nextInt();
                if (index >= 9 || index <= 1) {
                    System.out.println("không chèn được phần tử vào mảng");
                }
                addArray(array, element, index);
            } while (index >= 9 || index <= 1);
            System.out.println("Mảng sau khi chèn: " + Arrays.toString(array));
        }

        public static int[] addArray(int[] array, int element, int index) {
            for (int j = array.length - 1; j > index; j--) {
                array[j] = array[j - 1];
            }
            array[index] = element;
            return array;
        }
}
