package com.ariful.shape.impl;

import com.ariful.color.impl.Color;
import com.ariful.shape.Shape;

public class Square extends Shape {
    public Square(Color c) {
        super(c);
    }
    @Override
    public void fillColor() {
        System.out.print("Square filled with com.ariful.color ");
        color.addColor();
    }
}
