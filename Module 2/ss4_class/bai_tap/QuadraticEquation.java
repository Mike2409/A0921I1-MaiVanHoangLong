package ss4_class.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return (2 * this.b) - (4 * a * c);
    }

    public double getRoot1() {
        double result;
        result = (-this.b + Math.pow(((this.b * this.b) - (4 * this.a * this.c)), 0.5)) / (2 * this.a);
        return result;
    }

    public double getRoot2() {
        double result;
        result = (-this.b - Math.pow(((this.b * this.b) - (4 * this.a * this.c)), 0.5)) / (2 * this.a);
        return result;
    }

    public void calculator() {
        if (this.getDiscriminant() >= 0) {
            if (this.getDiscriminant() == 0) {
                System.out.println("The equation has one root: x = " + this.getRoot1());
            } else
                System.out.println("The equation has two root: x1 = " + this.getRoot1() + ", x2 = " + this.getRoot2());
        } else System.out.print("The equation has no real roots!");
    }

    public static void main(String[] args) {
            double a, b, c;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input a:");
            a = scanner.nextDouble();
            System.out.println("Input b:");
            b = scanner.nextDouble();
            System.out.println("Input c:");
            c = scanner.nextDouble();
            QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
            quadraticEquation.calculator();
    }
}
