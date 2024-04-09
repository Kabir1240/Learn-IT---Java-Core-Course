package com.udemy.learnit.javacore.codingExercises.presentsManagement;

public abstract class Sweet {
    protected String name;
    protected double weight;
    protected double sugarWeight;

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getSugarWeight() {
        return sugarWeight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSugarWeight(double sugarWeight) {
        this.sugarWeight = sugarWeight;
    }
}
