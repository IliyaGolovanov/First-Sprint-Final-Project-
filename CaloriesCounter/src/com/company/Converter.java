package com.company;

public class Converter {
    double distance(long sum){
        double distance = sum * 0.75;
        return distance;
    }
    void calories(long sum, int month){
        long calories = sum * 50;
        if(calories >= 1000){
            long kCalories = calories/1000;
            System.out.println("Количество сожжённых каллорий за месяц " + month + " составило " + kCalories + " килокалорий." );
        }
        else{
            System.out.println("Количество сожжённых каллорий за месяц " + month + " составило " + calories + " калорий." );
        }
    }
}
