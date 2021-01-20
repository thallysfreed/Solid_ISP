package com.silth;

public class Airplane implements IAirplane {
    @Override
    public void turnOnTurbine() {
        System.out.println("Turn on turbine...");
    }

    @Override
    public void takeOff() {
        turnOnTurbine();
        System.out.println("Taking off....");
    }
}
