package ss3_array.bai_tap;

import java.util.Scanner;

public class MaxInTwoArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số hàng của ma trận: ");
        int row = scanner.nextInt();
        System.out.println("Nhập vào số cột của ma trận: ");
        int col = scanner.nextInt();
        int[][] array = new int[row][col];
        for(int i = 0;i<row;i++) {
            for(int j = 0;j<col;j++) {
                System.out.println("Nhập phần tử Array["+i+"]["+j+"]");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Mảng đã nhập là: ");
        for(int i = 0;i<row;i++) {
            for(int j = 0;j<col;j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();

        }
        System.out.println("Giá trị lớn nhất trong mảng 2 chiều là: "+findMaxArray(array, row, col));


    }
    public static int findMaxArray(int[][] array, int row, int col) {
        int max = array[0][0];
        for(int i = 0;i<row;i++) {
            for(int j = 0;j<col;j++) {
                if(array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }
}
