package optional;

public class PaymentDto {
    private String transactionId;
    private double amount;
    private String currency;
    private String status;


    public PaymentDto(String transactionId, double amount, String currency, String status) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.currency = currency;
        this.status = status;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "PaymentDto{" +
                "transactionId='" + transactionId + '\'' +
                ", amount=" + amount +
                ", currency='" + currency + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
