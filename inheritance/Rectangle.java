package inheritance;

public class Rectangle  extends Shape{
        double length;
        double width;
        
        Rectangle(String color,double length,double width){
            super(color);
            this.length = length;
            this.width = width;
        }
        public double calculateArea(){
            return length*width;
        }
        public void displayRectangle(){
            displayShape();
            System.out.println("length: " + length);
            System.out.println("width: " + width);
            System.out.println("Area: " + calculateArea());
        }

    }

