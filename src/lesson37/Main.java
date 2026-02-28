package lesson37;

public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderService(new CreditCardService());
        //bu dependency inversion
    }

}

class PayPalPaymentService implements PaymentService {
    public void processPayment(double amount) {
        System.out.println("Processing Pay Pal payment $ " + amount);
    }
}

class CreditCardService implements PaymentService {
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card payment $ " + amount);
    }
}

interface PaymentService{
     void processPayment(double amount);
}

class OrderService {
    private final PaymentService paymentService;

    OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder(double amount) {
        paymentService.processPayment(amount);
    }
}