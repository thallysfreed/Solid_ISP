package com.silth;

public class Airplane implements IAirTrasnport {
    @Override
    public void turnOnTurbine() {
        System.out.println("Turn on turbine...");
    }

    @Override
    public void turnOnPropeller() {
        //
    }

    @Override
    public void takeOff() {
        turnOnTurbine();
        System.out.println("Taking off....");
    }
}
