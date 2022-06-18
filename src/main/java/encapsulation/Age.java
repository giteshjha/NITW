package main.java.encapsulation;

public class Age {
    private int age, maxAge = 25;
//    private int maxAge = 25;
    private int defaultAge = 1;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age<maxAge){
            this.age = age;
        }
        else{
            this.age = defaultAge;
        }
    }

    void changeAge(){
        Age age = new Age();
        age.age = 10;
    }
}






