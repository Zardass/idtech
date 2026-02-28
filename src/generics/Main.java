package generics;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        PaymentResponse<MobilePaymentResponse> mobilePaymentResponse = new PaymentResponse<>();
        mobilePaymentResponse.setTransactionId(UUID.randomUUID().toString());
        mobilePaymentResponse.setAmount(123.5);
        mobilePaymentResponse.setStatus("Success");
        mobilePaymentResponse.setDetails(new MobilePaymentResponse("0515359848","Azercell"));


        PaymentResponse<InternetPaymentResponse> internetPaymentResponse = new PaymentResponse<>();
        internetPaymentResponse.setTransactionId(UUID.randomUUID().toString());
        internetPaymentResponse.setAmount(342);
        internetPaymentResponse.setStatus("Success");
        internetPaymentResponse.setDetails(new InternetPaymentResponse("ahjg2152","CItynet"));

        System.out.println(mobilePaymentResponse);
        System.out.println(internetPaymentResponse);
    }
}
