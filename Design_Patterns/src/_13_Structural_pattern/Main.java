package _13_Structural_pattern;

//Step 1: Strategy interface
interface PaymentStrategy {
 void pay(int amount);
}

//Step 2: Concrete strategies
class CreditCardPayment implements PaymentStrategy {
 private String cardNumber;

 public CreditCardPayment(String cardNumber) {
     this.cardNumber = cardNumber;
 }

 @Override
 public void pay(int amount) {
     System.out.println("Paid ₹" + amount + " using Credit Card: " + cardNumber);
 }
}

class UPIPayment implements PaymentStrategy {
 private String upiId;

 public UPIPayment(String upiId) {
     this.upiId = upiId;
 }

 @Override
 public void pay(int amount) {
     System.out.println("Paid ₹" + amount + " using UPI: " + upiId);
 }
}

class PayPalPayment implements PaymentStrategy {
 private String email;

 public PayPalPayment(String email) {
     this.email = email;
 }

 @Override
 public void pay(int amount) {
     System.out.println("Paid ₹" + amount + " using PayPal account: " + email);
 }
}

//Step 3: Context class
class PaymentService {
 private PaymentStrategy strategy;

 // Client can set the strategy at runtime
 public void setPaymentStrategy(PaymentStrategy strategy) {
     this.strategy = strategy;
 }

 public void checkout(int amount) {
     if (strategy == null) {
         System.out.println("Please select a payment method!");
     } else {
         strategy.pay(amount);
     }
 }
}

//Step 4: Client
public class Main {
 public static void main(String[] args) {
     PaymentService service = new PaymentService();

     // Pay with Credit Card
     service.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432"));
     service.checkout(500);

     // Pay with UPI
     service.setPaymentStrategy(new UPIPayment("user@upi"));
     service.checkout(750);

     // Pay with PayPal
     service.setPaymentStrategy(new PayPalPayment("user@example.com"));
     service.checkout(1200);
 }
}

