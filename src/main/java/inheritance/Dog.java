package main.java.inheritance;

public class Dog extends Animal{
    public String color = "Black";

    public static void main(String[] args) {
        System.out.println("Welocme to Object oriented programming!");
        Child child = new Child();
        child.inc2();
    }
}

class Parent {

    int counter = 0;

    void inc1() {
        inc2();
    }

    void inc2() {
        counter++;
    }

}


class Child extends Parent {

    @Override
    void inc2() {
        inc1();
        System.out.println(counter);
    }

}

// Borrow book
// Register
// Searching the book
// returning the book
// check fine

/*

* Student(name, rollNumber)

    class Student{
        name,
        rollNumber

        void register(Student student){
            springJpaObject.register(student)
        }



        void searchBook(String name){
            springJpaObject.findBy(name);
        }
        bool checkIfFineExist(){

        }
        void returnBook(){

        }
    }

    class Book{
        bookName

    }
*
* */

