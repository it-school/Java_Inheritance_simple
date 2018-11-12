package com.itschool;

public class Doggy extends Mammals {
    String color;

    void Voice()
    {
        System.out.println("Гав!");
    }

    public Doggy() {
    }

    public Doggy(String title, int age, int temperature, int mammalTime, String color) {
        super(title, age, temperature, mammalTime);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", color = " + color;
    }
}
