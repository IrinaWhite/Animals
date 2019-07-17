package com.company;

public class bird extends Animals {
    public bird(int age, int weight, String color) {
        setAge(age);
        setWeight(weight);
        setColor(color);
    }

    @Override
    public String getName() {
        return "Bird{}";
    }


}
