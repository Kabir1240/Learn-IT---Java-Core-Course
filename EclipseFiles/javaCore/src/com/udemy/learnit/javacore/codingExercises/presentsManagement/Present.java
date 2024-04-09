package com.udemy.learnit.javacore.codingExercises.presentsManagement;

import java.util.Arrays;

public class Present {
    public static final int NUMBER_OF_SWEETS = 10;
    Sweet[] sweets;
    int current_sweet_index;

    {
        sweets = new Sweet[NUMBER_OF_SWEETS];
        current_sweet_index = 0;
    }

    public void addSweet(Sweet sweet) {
        if (sweet == null){
            return;
        }
        if (sweets.length <= current_sweet_index) {
            sweets = Arrays.copyOf(sweets, sweets.length * 2);
        }
        this.sweets[current_sweet_index] = sweet;
        current_sweet_index++;
    }

    public double calculateTotalWeight() {
        double totalWeight = 0d;
        for (Sweet sweet : this.sweets) {
            if (sweet != null) {
                totalWeight += sweet.getWeight();
            }
        }
        return totalWeight;
    }

    public Sweet[] filterSweetsBySugarRange(double minSugarWeight, double maxSugarWeight) {
        int matchedSweetsAmount = 0;
        for (Sweet sweet : this.sweets)
        {
            if (sweet != null && sweet.getSugarWeight() >= minSugarWeight && sweet.getSugarWeight() <= maxSugarWeight)
            {
                matchedSweetsAmount++;
            }
        }

        Sweet[] matchedSweets = new Sweet[matchedSweetsAmount];
        int index = 0;
        for (Sweet sweet : this.sweets)
        {
            if (sweet != null && sweet.getSugarWeight() >= minSugarWeight && sweet.getSugarWeight() <= maxSugarWeight)
            {
                matchedSweets[index] = sweet;
                index++;
            }
        }
        return matchedSweets;
    }

    public Sweet[] getSweets() {
        return Arrays.copyOf(this.sweets, current_sweet_index);
    }

}
