package Baitap2;

public class Main {
    public static void main(String[] args) {
        Colorable[] colorable = new Colorable[3];
        colorable[0] = new Rectangle(10,4,"blue",false);
        colorable[1] = new Circle(7.4,"green",false);
        colorable[2] = new Square(3,"red",true);

        for (int i = 0; i < colorable.length; i++) {
            System.out.println(colorable[i]);
            if (colorable[i] instanceof Square){
                ((Square) colorable[i]).howToColor();
            }
        }
    }
}
