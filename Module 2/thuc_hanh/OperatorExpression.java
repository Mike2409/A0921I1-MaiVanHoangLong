import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float height;
        float width;

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Enter width: ");
        width = scanner1.nextFloat();

        System.out.println("Enter height: ");
        height = scanner1.nextFloat();

        float area = width * height;
        System.out.println("Area is " + area);
    }
}
