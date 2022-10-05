package Baitap1;

public class  Circle extends Shape{
    @Override
    public void resize(double percent) {
       this.radius = percent;
    }

    private double radius = 1.0;

    public Circle() {
    }



    @Override
    public void setLength(double length) {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius,String color,boolean filled) {
        super();
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public Circle(String color, boolean filled) {
        super(color, filled);
    }

    @Override
    public void setWidth(double width) {

    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getPerimeter(){
        return  2 * radius * Math.PI;
    }
    @Override
    public String toString() {
        return "A Circle width radius="+getRadius();
    }
}

