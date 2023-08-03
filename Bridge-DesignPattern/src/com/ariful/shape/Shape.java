package com.ariful.shape;

import com.ariful.color.impl.Color;

public abstract class Shape {

    protected Color color;

    public Shape(Color c) {
        this.color = c;
    }

    abstract public void fillColor();
}
