
package com.company;
import javafx.scene.canvas.GraphicsContext;
import java.awt.Color;

public class MyCircle extends MyShape {
    private int radius;

    public MyCircle(int x, int y, int radius , Color color) {
        super(x,y,color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public double getArea() {
         return (Math.PI)* Math.pow(getRadius(),2);

    }

    public double getPerimeter() { //Circumference
        return (Math.PI)*(2*getRadius());
    }

    @Override
    public String toString() {
        return "The radius of this object is " + this.getRadius() + ". The perimeter of this object is " + this.getPerimeter() +
                ". The Area of this object is " + this.getArea();
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.setFill(super.getColor());
        gc.fillOval(super.getX() - getRadius() , super.getY() - getRadius() , getRadius() *2 ,
                getRadius() *2);

    }
}
