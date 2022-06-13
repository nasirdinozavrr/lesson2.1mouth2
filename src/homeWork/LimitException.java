package homeWork;

public class LimitException extends Exception{
    private Double remainingAmount;

    public static Double getRemainingAmount() {
        return remainingAmount;
    }

    public LimitException(String message) {
        super(message);
        this.remainingAmount = remainingAmount;


    }
}
