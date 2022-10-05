package Baitap1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Resizeable[] resizeable = new Resizeable[5];
        resizeable[0] = new Rectangle(8,7);
        resizeable[1] = new Circle(2.3,"red",false);
        resizeable[2] = new Square(3,"blue",true);
//        System.out.println("pre-sorted");

        for (int i = 0; i < resizeable.length; i++) {
            System.out.println("kich thuoc truoc khi tang");
            System.out.println(resizeable[i] + "\n");
            resizeable[i].resize(Math.random()*100);

            System.out.println("Sau khi tang kich thuoc :");
            System.out.println(resizeable[i]+"");

        }
    }
}
