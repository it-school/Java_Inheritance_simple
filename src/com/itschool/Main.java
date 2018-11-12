package com.itschool;

public class Main {

    public static void main(String[] args)
    {
        Animals animal = new Animals("Animal", 30, 31);
        System.out.println("Animal:" + animal.toString());
        Mammals mammal = new Mammals("Bird", 300, 37, 3);
        System.out.println("Mammal:" + mammal.toString());

        Doggy dog = new Doggy("Droopy", 3, 38, 2, "Black/white");
        System.out.println(dog.toString());
        dog.Voice();

        animal = dog;
        dog = (Doggy) animal;
        System.out.println(animal);

        Animals a = new Doggy("DroopyAnimal", 5, 35, 5, "Red");
        System.out.println(a.toString());

        /*
        Doggy d = (Doggy) (new Animals("Animal", 30, 31));
        System.out.println( d);  // Синтаксически - верно, но логически - некорректно
    */

        Doggy d = (Doggy) a;
        System.out.println( d);
    }
}
