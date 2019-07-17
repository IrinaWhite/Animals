package com.company;

public  class snake extends Animals {
    public snake(int age, int weight, String color) {
        setAge(age);
        setWeight(weight);
        setColor(color);
    }

    @Override
    public String getName() {
        return "Snake";
    }
}