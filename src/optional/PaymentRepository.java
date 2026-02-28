package optional;

import java.util.Optional;

public class PaymentRepository {
    public Optional<PaymentDto> findByPaymentTransactionId(String textId){
        if(textId.equals("12345")){
            return Optional.of(
            new PaymentDto(
                    "12345",
                    123,
                    "AZN",
                    "ACTIVE"
            )
            );

        }
        return Optional.empty();
    }
}
