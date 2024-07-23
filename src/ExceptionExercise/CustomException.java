package ExceptionExercise;

public class CustomException {

    public static class InsufficientFundsException extends Exception {

		public InsufficientFundsException(String message) {
            super(message);
        }
    }

    private double balance;

    public CustomException(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds. Available balance: " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }

    public static void main(String[] args) {
        CustomException account = new CustomException(100.00);

        try {
            account.withdraw(100.00); 
        } catch (InsufficientFundsException e) {
            System.err.println(e.getMessage());
        }

        try {
            account.withdraw(40.00); 
        } catch (InsufficientFundsException e) {
            System.err.println(e.getMessage());
        }
    }
}