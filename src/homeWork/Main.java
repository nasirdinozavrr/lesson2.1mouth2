package homeWork;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму");
        Integer money = scanner.nextInt();

    while (true);
        try {
            bankAccount.deposit((double) money);
        } catch (LimitException i) {
            i.printStackTrace();
        }
        Scanner scanner1 = new Scanner(System.in);
        while (true);
            try {
                bankAccount.withDraw(scanner1.nextInt());
            } catch (LimitException e) {
                    System.out.println(e.getMessage());
                try {
                    bankAccount.withDraw((int) (LimitException.getRemainingAmount()));
                } catch (LimitException ea) {
                    ea.printStackTrace();
                }
            break;
        }
    }
}





