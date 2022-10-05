package Baitap1;

public  class Rectangle extends Shape{
    @Override
    public void resize(double percent) {
        this.width= percent;
        this.length = percent;
    }

    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width,double length,String color,boolean filled) {
        super();
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return width * this.length;
    }
    public double getPerimeter(){
        return 2 * (width + this.length);
    }
    @Override
    public String toString(){
        return "A rectangle width width ="+getWidth()+"\nand length="+getLength();
    }
}
