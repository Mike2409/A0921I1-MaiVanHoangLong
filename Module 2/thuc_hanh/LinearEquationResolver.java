import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("ax + b = c");

        Scanner scanner= new Scanner(System.in);

        System.out.println("Print a: ");
        float a = scanner.nextFloat();
        System.out.println("Print b: ");
        float b = scanner.nextFloat();
        System.out.println("Print c: ");
        float c = scanner.nextFloat();

        if (a != 0) {
            float answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        } else {
            if (b == c) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }

    }
}
