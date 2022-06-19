package main.java.absctration;

public class PayementGatewayImplementation implements PaymentGateway{

    @Override
    public void pay(double amount) {
        System.out.println("Razorpay Payment...");
    }

    public void someOtherMEthod(){
        System.out.println("Some other method...");
    }
}


