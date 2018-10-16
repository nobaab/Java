package Uml;

public class Circle {


    private double radius;
    private String color;

    public void setData(double radius, String color){
        this.radius = radius;
        this.color = color;
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

    public void display(){
        System.out.println("Circle radius:"+getRadius());
        System.out.println("Circle Color:"+getColor());
    }


}
