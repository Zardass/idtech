package optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
//        var repo = new PaymentRepository();
//        Optional<PaymentDto> dto = repo.findByPaymentTransactionId("123456");
//        if (dto.isPresent()) {
//            PaymentDto paymentDto = dto.get();
//            if (paymentDto.getAmount() < 100) {//getdi null un amountun cagirmaga olmaz nullpointer exception bunun ucun manual handling lazimdir
//                System.out.println("Amount is less than 100");
//            } else {
//                System.out.println("regular amount");
//            }
//        }

        CustomFunctionalInterface customFunctionalInterface = new CustomFunctionalInterface() {
            @Override
            public void execute() {
                System.out.println("Hello World");
            }
        };
        System.out.println(customFunctionalInterface);

        CustomFunctionalInterface obj = ()-> System.out.println("Hello World");
        obj.execute();
    }


}
