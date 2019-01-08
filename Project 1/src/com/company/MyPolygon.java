
package com.company;
import javafx.scene.canvas.GraphicsContext;
import java.awt.Color;

public class MyPolygon extends MyShape {
    private int N; // the n represents the number of the polygon's equal side lengths and
    // equal interior angles
    private double sideLength;
    public MyPolygon(int N, double sideLength ,int x, int y, Color color) {
        super(x,y, color);
        this.N = N;
        this.sideLength = sideLength;
    }

    public int getN() {
        return N;
    }

    public double getSideLength() {
        return sideLength;
    }

    public double getAngle() {
        return (180*(getN()-2))/getN();
    }

    public double getPerimeter() {
        return getN()*getSideLength();
    }

    public double getArea() {
        double getRadians = Math.toRadians(180/getN());
        return Math.pow(getSideLength(),2)*getN()/4*(Math.tan(getRadians));
    }

    @Override
    public String toString() {
        return "Polygon has side length " + getSideLength() + " ,Interior angle " + getAngle() +
                " Perimeter, " + getPerimeter() + " and area, " + getArea();
    }

    @Override
    public void draw(GraphicsContext gc) {
        // the value of the x_vertices , y_vertices are in radians
        // everything is converted to radians
        double[] x_vertices = new double[getN()];
        double[] y_vertices = new double[getN()];
        double angle = (getN()-1)*getAngle();
        double angle_increment = (2*Math.PI)/getN();
        for (int i = 0; i < getN(); i++) {
            x_vertices[i] =  super.getX() + (getSideLength()*(Math.cos(angle)));
            y_vertices[i] =  super.getY() + (getSideLength()*(Math.sin(angle)));
            angle += angle_increment;
        }
        gc.setFill(super.getColor());
        gc.fillPolygon(x_vertices,y_vertices,getN());
    }

}
