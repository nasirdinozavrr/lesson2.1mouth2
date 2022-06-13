package homeWork;

public class BankAccount {
    private Double remainingAmount;


    public Double getRemainingAmount() {
        return remainingAmount;
    }

    //  deposit(double sum) - положить деньги на счет,
    public Double deposit(Double sum) {
        remainingAmount += sum;
        System.out.println("Вы пополнили счет на" + sum);
        return sum;
    }

    // withDraw(int sum) - снимает указанную сумму со счета.
    public Integer withDraw(Integer sum) throws LimitException {
        // если запрашиваемая сумма на снятие больше чем остаток денег на счете
        if (sum < remainingAmount)
            throw new LimitException("Запрашиваемая сумма " +
                    sum + " на снятие больше чем остаток");
        else {
            remainingAmount -= sum;
            System.out.println("Вы сняли со счета:" + sum + ". Остаток:" + remainingAmount);
            return sum;
        }

    }
}
