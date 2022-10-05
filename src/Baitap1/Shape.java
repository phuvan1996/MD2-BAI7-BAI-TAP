package Baitap1;
    public abstract class Shape implements Resizeable{
        @Override
        public void resize(double percent) {
        }

        private String color = "green";
        private boolean filled = true;

        public Shape() {
        }

        public Shape(String color, boolean filled) {
            this.color = color;
            this.filled = filled;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public boolean isFilled() {
            return filled;
        }

        public void setFilled(boolean filled) {
            this.filled = filled;
        }

        public abstract void setWidth(double width);

        public abstract void setLength(double length);

        @Override
        public String toString(){
            return "A shape width color of "+getColor()+"and"+(isFilled() ? "filled":"not filled");

        }
        public static void printShape(Shape[] shapes){
            for (Shape shape:shapes){
                System.out.println(shape.toString());
            }
        }
    }
