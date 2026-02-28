package generics;

public class InternetPaymentResponse {
    private String contractNumber;
    private String provider;

    public InternetPaymentResponse(String contractNumber, String provider) {
        this.contractNumber = contractNumber;
        this.provider = provider;
    }

    @Override
    public String toString() {
        return "generics.InternetPaymentResponse{" +
                "contractNumber='" + contractNumber + '\'' +
                ", provider='" + provider + '\'' +
                '}';
    }
}
