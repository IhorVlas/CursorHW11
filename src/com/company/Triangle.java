package com.company;

import java.awt.*;

public class Triangle extends BaseShape {

    public int x2, x3, y2, y3;

    public Triangle(int x, int y, int x2, int y2, int x3, int y3, Color color) {
        super(x, y, color);
        this.x2 = x2;
        this.x3 = x3;
        this.y2 = y2;
        this.y3 = y3;
    }

    @Override
    public void paint(Graphics graphics) {
        paint1(graphics);
        paint2(graphics);
        paint3(graphics);
    }

    ;

    public void paint1(Graphics graphics) {
        super.paint(graphics);
        graphics.drawLine(x, y, x2, y2);
    }

    public void paint2(Graphics graphics) {
        super.paint(graphics);
        graphics.drawLine(x2, y2, x3, y3);
    }

    public void paint3(Graphics graphics) {
        super.paint(graphics);
        graphics.drawLine(x, y, x3, y3);
    }
}
