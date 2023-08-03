package com.ariful.shape.impl;

import com.ariful.color.impl.Color;
import com.ariful.shape.Shape;

public class Triangle extends Shape {
    public Triangle(Color c) {
        super(c);
    }

    @Override
    public void fillColor() {
        System.out.print("Triangle filled with com.ariful.color ");
        color.addColor();
    }
}
