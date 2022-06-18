package main.java.polymorphism;

public class Shape {
    public void area(int side){
        System.out.println(side*4);
    }

    public void area(int length, int width){
        System.out.println(length*width);
    }
}



