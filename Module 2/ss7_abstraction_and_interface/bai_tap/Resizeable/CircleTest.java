package ss7_abstraction_and_interface.bai_tap.Resizeable;

public class CircleTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(Math.random() *10);
        circles[1] = new Circle(Math.random()*10);
        circles[2] = new Circle(Math.random()*10);
        System.out.println("After : ");
        for(Circle i : circles){
            System.out.println(i);
        }
        System.out.println("Before : ");
        for(Circle i : circles){
            i.Resize(Math.random() * 100);
            System.out.println(i);
        }
    }
}
