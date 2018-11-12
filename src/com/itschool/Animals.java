package com.itschool;

public class Animals
{
    String title;
    int age;
    int temperature;

    public Animals()
    {
        this.title = "";
        this.age = -1;
        this.temperature = -1;
    }

    public Animals(String title, int age, int temperature) {
        this.title = title;
        this.age = age;
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return
                "title='" + title + '\'' +
                ", age=" + age +
                ", temperature=" + temperature ;
    }
}
