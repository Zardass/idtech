package generics;

public class MobilePaymentResponse {
    private String phoneNumber;
    private String provider;

    public MobilePaymentResponse(String phoneNumber, String provider) {
        this.phoneNumber = phoneNumber;
        this.provider = provider;
    }

    @Override
    public String toString() {
        return "generics.MobilePaymentResponse{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", provider='" + provider + '\'' +
                '}';
    }
}
