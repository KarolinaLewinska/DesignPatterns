package com.java.designpatterns.facade;

public class Facade {
    private FirstSubsystem firstSubsystem;
    private SecondSubsystem secondSubsystem;
    private ThirdSubsystem thirdSubsystem;
    private FourthSubsystem fourthSubsystem;

    public Facade() {
        firstSubsystem = new FirstSubsystem();
        secondSubsystem = new SecondSubsystem();
        thirdSubsystem = new ThirdSubsystem();
        fourthSubsystem = new FourthSubsystem();
    }

    public void MethodA() {
        System.out.println("MethodA");
        firstSubsystem.firstMethod();
        secondSubsystem.secondMethod();
        fourthSubsystem.fourthMethod();
    }

    public void MethodB() {
        System.out.println("MethodB");
        secondSubsystem.secondMethod();
        thirdSubsystem.thirdMethod();
    }
}