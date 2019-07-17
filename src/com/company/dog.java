package com.company;

public  class dog extends Animals {
    public dog(int age, int weight, String color) {
        setAge(age);
        setWeight(weight);
        setColor(color);
    }

    @Override
    public String getName() {
        return "Dog";
    }
}