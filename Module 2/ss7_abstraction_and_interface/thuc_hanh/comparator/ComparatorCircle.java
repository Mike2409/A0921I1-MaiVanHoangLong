package ss7_abstraction_and_interface.thuc_hanh.comparator;

import ss6_inheritance.thuc_hanh.Circle;

import java.util.Comparator;

public class ComparatorCircle implements Comparator<Circle> {
    @Override
    public int compare(Circle o1, Circle o2) {
        if(o1.getRadius() > o2.getRadius())return 1;
        else if(o1.getRadius() < o2.getRadius())return -1;
        else return 1;
    }
}
