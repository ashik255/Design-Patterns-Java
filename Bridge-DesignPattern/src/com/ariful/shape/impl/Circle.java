package com.ariful.shape.impl;

import com.ariful.color.impl.Color;
import com.ariful.shape.Shape;

public class Circle extends Shape {
    public Circle(Color c) {
        super(c);
    }

    @Override
    public void fillColor() {
        System.out.print("Circle filled with color ");
        color.addColor();
    }
}
