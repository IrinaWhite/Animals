package com.company;

public class Main {

    public static void main(String[] args) {
        dog dog = new dog(6, 25, "Black");
        cat cat = new cat(3, 15, "White");
        bird bird = new bird(2, 3, "Yellow");
        snake snake = new snake(11, 11, "Green");
        System.out.println(dog.toString());
        System.out.println(cat.toString());
        System.out.println(bird.toString());
        System.out.println(snake.toString());
    }
}
