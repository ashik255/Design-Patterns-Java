package com.ariful;

import com.ariful.Bird;
import com.ariful.ToyDuck;

public class BirdAdapter implements ToyDuck {

    Bird bird;

    public BirdAdapter(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void squeak() {
        bird.makeSound();
    }
}
