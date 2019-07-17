package com.company;

public  class cat extends Animals {
    public cat(int age , int weight,String color ) {
        setAge(age);
        setWeight(weight);
        setColor(color);

    }
    @Override
    public String getName() {
        return "Cat";
    }

}
