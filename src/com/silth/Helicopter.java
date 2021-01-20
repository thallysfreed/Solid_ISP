package com.silth;

public class Helicopter implements IHelicopter{

    @Override
    public void turnOnPropeller() {
        System.out.println("Turn on propeller...");
    }

    @Override
    public void takeOff() {
        turnOnPropeller();
        System.out.println("Taking off....");
    }
}
