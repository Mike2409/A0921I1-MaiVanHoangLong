package ss3_array.thuc_hanh;

import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] lol = {"Yasuo","Hasagi","Kimochi","Yamate"};

        System.out.println("Nhập vào từ bạn muốn tìm trong mảng");
        String name = scanner.nextLine();

        boolean coKhong = false;
        for (int i = 0; i < lol.length; i++){
            if(lol[i].equals(name)){
                System.out.println("Vị trí từ bạn đang tìm ở vị trí " + (i+1));
                coKhong = true;
                break;
            }
        }
        if (!coKhong){
            System.out.println("Tìm không ra ba ơi.");
        }
    }
}
