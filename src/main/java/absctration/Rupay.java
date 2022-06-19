package main.java.absctration;

public class Rupay implements PaymentGateway{

    @Override
    public void pay(double amount) {
        System.out.println("Rupay Payment...");
    }

    public void someOtherMEthod(){
        System.out.println("Some other method...");
    }
}
