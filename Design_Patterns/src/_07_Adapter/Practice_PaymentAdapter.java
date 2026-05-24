package _07_Adapter;

interface PaymentProcessor {
    void pay(double amount);
}
class CreditCardPaymentProcessor implements PaymentProcessor {

    @Override
    public void pay(double amount) {
        System.out.println("Processing Credit Card payment: " + amount);
    }
}
class UpiPaymentProcessor implements PaymentProcessor {

    @Override
    public void pay(double amount) {
        System.out.println("Processing UPI payment: " + amount);
    }
}

class RazorpayGateway {

    public void makePayment(double totalAmount) {
        System.out.println("Razorpay payment successful: " + totalAmount);
    }
}

class RazorpayAdapter implements PaymentProcessor {

    private RazorpayGateway razorpayGateway;

    public RazorpayAdapter(RazorpayGateway razorpayGateway) {
        this.razorpayGateway = razorpayGateway;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Using Razorpay Adapter...");
        razorpayGateway.makePayment(amount);
    }
}


class OrderService {

    private PaymentProcessor paymentProcessor;

    public OrderService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void placeOrder(double amount) {

        System.out.println("Order initiated...");

        paymentProcessor.pay(amount);

        System.out.println("Order completed\n");
    }
}

public class Practice_PaymentAdapter {

	public static void main(String[] args) {
		// Credit Card Payment
        PaymentProcessor creditCard = new CreditCardPaymentProcessor();
        OrderService order1 = new OrderService(creditCard);
        order1.placeOrder(1000);


        // UPI Payment
        PaymentProcessor upi = new UpiPaymentProcessor();
        OrderService order2 = new OrderService(upi);
        order2.placeOrder(2000);


        // Razorpay Payment (via Adapter)
        RazorpayGateway razorpayGateway = new RazorpayGateway();
        PaymentProcessor razorpay = new RazorpayAdapter(razorpayGateway);

        OrderService order3 = new OrderService(razorpay);
        order3.placeOrder(3000);

	}

}
