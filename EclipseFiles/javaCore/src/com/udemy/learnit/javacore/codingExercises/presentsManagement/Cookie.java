package com.udemy.learnit.javacore.codingExercises.presentsManagement;

public abstract class Cookie extends Sweet {
    public double getDoughWeight() {
        return doughWeight;
    }

    public void setDoughWeight(double doughWeight) {
        this.doughWeight = doughWeight;
    }

    protected double doughWeight;
}