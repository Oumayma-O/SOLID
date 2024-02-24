package com.directi.training.lsp.exercise;

import com.directi.training.lsp.exercise.Duck;

public class RealDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack...");
    }

    @Override
    public void swim() {
        System.out.println("Swim...");
    }
}
