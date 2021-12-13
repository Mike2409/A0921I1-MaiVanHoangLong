package ss4_class.bai_tap;

import java.util.Scanner;

public class Fan {
    final int SLOW=1;
    final int MEDIUM=2;
    final int FAST=3;
    private int speed = SLOW;
    private boolean on = false;
    private  double radius = 5;
    private String color = "blue";
    public Fan(){

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        if (this.on !=false){
            return "fan is on,"+" \nSpeed: "+speed+" \nColor: "+color+" \nRadius: "+radius;
        }
        else {
            return "fan is off,"+" \nColor: "+color+" \nRadius: "+radius;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fan fan1 = new Fan();
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOn(true);
        System.out.println(fan1.toString());
        Fan fan2 = new Fan();
        fan2.setSpeed(2);
        System.out.println(fan2.toString());
    }
}
