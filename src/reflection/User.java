package reflection;

public class User {
    @PIN(message = "Pin must be 7 symbols")
    private String pin;

    public User(String pin) {
        this.pin = pin;
    }
}
