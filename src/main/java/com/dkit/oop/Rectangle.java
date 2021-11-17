package com.dkit.oop;
//TODO
// change Rectangle declaration so that Rectangle inherits from Shape

public class Rectangle extends Shape {

private int height;
private int width;


public Rectangle (int x, int y , int width , int height)
{
super(x,y);
this.width = width;
this.height = height;

}
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

public double area()
{
    return width*height;
}

    @Override
    public String toString() {
        return super.toString()+" {" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

}
