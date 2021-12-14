package ss5_modifier_method_property.bai_tap.AccessModifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    final double Pi = 3.14;

    Circle(){
    }

    Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return this.radius*2*Pi;
    }
}
