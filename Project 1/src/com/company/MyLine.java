
package com.company;
import javafx.scene.canvas.GraphicsContext;
import java.awt.Color;

public class MyLine extends MyShape {
        private int x2;
        private int y2;

        public MyLine(int x, int x2, int y, int y2, Color color ) {
            super(x, y,color);
            this.x2 = x2;
            this.y2 = y2;
        }

        public int getLength() {
            int distance =  (int) Math.hypot(this.x2 - getX(), this.y2 - getY());
            return distance;
        }

        public double get_xAngle() {
            double slope =  (double) (this.y2 - getY())/(this.x2 - getX());
            double xAngle = Math.toDegrees(Math.atan(slope));
            return xAngle;
        }

        @Override
        public String toString() {
            return "The length of this instance object is " + this.getLength() + " and the angle relative to the x-axis is "
                    + this.get_xAngle();
        }

        @Override
        public void draw(GraphicsContext gc) {
            gc.setStroke(super.getColor());
            gc.setLineWidth(2);
            gc.strokeLine(super.getX(), super.getY(),this.x2, this.y2);
        }
}
