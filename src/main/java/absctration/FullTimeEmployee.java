package main.java.absctration;

public class FullTimeEmployee extends Tax implements Home{
    public double income;

//    @Override
    public void calculate_tax() {
        System.out.println("=====> Calculate tax FullTimeEmployee");
    }

    @Override
    public void getHome() {

    }


//    public void getHome(){
//
//    }
}
