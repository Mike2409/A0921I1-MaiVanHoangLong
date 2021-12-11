package ss4_class.thuc_hanh;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều rộng HCN");
        double width = scanner.nextDouble();
        System.out.println("Nhập chiều cao HCN");
        double height = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(width,height);

        System.out.println("Rectangle: "+rectangle.display());
        System.out.println("Area Rectangle: "+rectangle.getArea());
        System.out.println("Perimeter Rectangle: "+rectangle.getPerimeter());
    }
}
