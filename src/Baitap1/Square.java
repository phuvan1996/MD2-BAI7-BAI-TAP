package Baitap1;

public class Square extends Shape{
    private double side;




    public Square(double side){
        this.side = side;
    }
    public Square(double side, String color, boolean filled) {
        super(color,filled);
        this.side=side;
    }
    public double getSide(){
        return getWidth();
    }

    private double getWidth() {
        return this.side;
    }

    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }
    @Override
    public  void setWidth(double width){
        setSide(width);
    }
    @Override
    public void setLength(double length){
        setSide(length);
    }
    @Override
    public String toString(){
        return "A Square width side="+getSide();
    }
    @Override
    public void resize(double percent) {
        this.side = percent;

    }

}
