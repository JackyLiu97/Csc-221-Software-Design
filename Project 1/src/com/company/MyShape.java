
package com.company;
import javafx.scene.canvas.GraphicsContext;
import java.awt.*;

public class MyShape {
    private int x;
    private int y;
    private Color color;

    public MyShape(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public javafx.scene.paint.Color getColor(){
        java.awt.Color awtColor = this.color;
        int r = awtColor.getRed();
        int g = awtColor.getGreen();
        int b = awtColor.getBlue();
        int a = awtColor.getAlpha();
        double opacity = a / 255.0 ;
        javafx.scene.paint.Color fxColor = javafx.scene.paint.Color.rgb(r, g, b, opacity);
        return fxColor;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void shiftXY(int nX, int nY) {
        x = getX() + nX;
        y = getY() + nY;
    }

    public String toString() {
        return "the value of X and Y is " + this.x + this.y + " and the color is " + this.color;
    }

    public void draw(GraphicsContext gc ) {
            gc.setFill(getColor());
            gc.fillRect(0,0,999,999);
    }
}

