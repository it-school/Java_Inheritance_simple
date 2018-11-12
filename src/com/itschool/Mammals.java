package com.itschool;

public class Mammals extends Animals
{
    int mammalTime;

    public Mammals()
    {
        super();
        this.mammalTime = 0;
    }

    public Mammals(String title, int age, int temperature, int mammalTime) {
        super(title, age, temperature);
        this.mammalTime = mammalTime;
    }

    @Override
    public String toString() {
        return super.toString() + ", mammal time = " + this.mammalTime;
    }
}
