package com.example.task1;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

abstract class Shape implements Cloneable{
    protected Color color, outline;
    protected double x,y, w, h, outline_size;

    abstract double area();

    abstract void draw(GraphicsContext gr);
    abstract void setBorder(Color color, double size);
    public Shape(Color color) {
        System.out.println("Shape constructor called");
        this.color = color;
    }
    public void setColor(Color color) {
        this.color=color;
    }
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void setWH(double w, double h) {
        this.w = w;
        this.h = h;
    }
    @Override
    public String toString() {
        return "Неизвестная фигура";
    }

    public Object clone() {
        Object clone = null;
        try
        {
            clone = super.clone();
        } catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return clone; }
}
