package com.autoparts.general.enums;


import java.util.Random;

public enum Body {
    SEDAN, HATCHBACK, UNIVERSAL, COUPE, SUV, MINIVAN, OTHER;

    public static Body getRandomBody() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
