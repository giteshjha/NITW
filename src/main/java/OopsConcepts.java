package main.java;


import main.java.absctration.FullTimeEmployee;
import main.java.absctration.PartTimeEmployee;
import main.java.absctration.SeniorCitizenEmployee;
import main.java.encapsulation.Age;
import main.java.inheritance.Cat;
import main.java.inheritance.Dog;
import main.java.polymorphism.Parrot;
import main.java.polymorphism.Shape;

public class OopsConcepts {
    public static void main(String[] args) {
        System.out.println("Welocme to Object oriented programming!");

//        Age age = new Age();
//        age.setAge(27);
//        System.out.println(age.getAge());

//        Dog dog = new Dog();
//        dog.name = "Dog";
//        dog.eat();
//        Cat cat = new Cat();
//        cat.name = "Cat";
//        cat.eat();
//        System.out.println(dog.color);

        Shape shape = new Shape();
        shape.area(4);
        shape.area(4,3);

//        String.valueOf()

        Parrot parrot = new Parrot();
        parrot.fly();

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
        fullTimeEmployee.income = 100;
        fullTimeEmployee.calculate_tax();

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee();
        partTimeEmployee.income = 100;
        partTimeEmployee.calculate_tax();

        SeniorCitizenEmployee seniorCitizenEmployee = new SeniorCitizenEmployee();
        seniorCitizenEmployee.calculate_tax();
    }



}
