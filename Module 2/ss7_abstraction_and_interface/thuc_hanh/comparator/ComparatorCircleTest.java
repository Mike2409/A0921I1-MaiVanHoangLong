package ss7_abstraction_and_interface.thuc_hanh.comparator;

import ss7_abstraction_and_interface.thuc_hanh.comparable.ComparableCircle;

import java.util.Arrays;

public class ComparatorCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] comparableCircles = new ComparableCircle[3];
        comparableCircles[0] = new ComparableCircle(3.6);
        comparableCircles[1] = new ComparableCircle();
        comparableCircles[2] = new ComparableCircle(3.5,"igo",false);
        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : comparableCircles) {
            System.out.println(circle);
        }
        Arrays.sort(comparableCircles);
        System.out.println("After-sorted:");
        for (ComparableCircle circle : comparableCircles) {
            System.out.println(circle);
        }
    }
}
