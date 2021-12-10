package ss3_array.bai_tap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EraseElementInArray {
    public static void main(String[] args) {
        //khai báo mảng ArrayList languages
        ArrayList<Integer> numbers = new ArrayList<>();
        //sử dụng phương thức add() để thêm phần tử cho mảng languages
        numbers.add(10);
        numbers.add(4);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(6);
        System.out.println("Các phần tử trong mảng: " + numbers);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào phần tử bạn muốn xóa:");

        int i = scanner.nextInt();
        Integer element = numbers.remove(i-1);
        System.out.println("Các phần tử trong mảng sau khi xóa: " + numbers);
        System.out.println("Phần tử đã bị xóa là: " + element);
    }
}