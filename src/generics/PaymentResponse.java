package generics;

public class PaymentResponse<T> {
    private String transactionId;
    private String status;
    private double amount;
    private T details;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public T getDetails() {
        return details;
    }

    public void setDetails(T details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "generics.PaymentResponse{" +
                "transactionId='" + transactionId + '\'' +
                ", status='" + status + '\'' +
                ", amount=" + amount +
                ", details=" + details +
                '}';
    }
}
