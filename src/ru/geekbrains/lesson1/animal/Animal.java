package ru.geekbrains.lesson1.animal;

import ru.geekbrains.lesson1.enums.Color;

public abstract class Animal {

    private String name;
    private Color color;
    private int age;

    public Animal(String name, Color color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public abstract void voice();

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

}
