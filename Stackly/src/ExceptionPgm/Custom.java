package ExceptionPgm;

 class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException(String msg) {
		super(msg);
	}
}

public class Custom {

    static void withdraw(double balance, double amount)
            throws InsufficientBalanceException {

        if (amount > balance) {

            throw new InsufficientBalanceException(
                "Insufficient balance"
            );
        }

        System.out.println("Withdrawal successful");
    }

    public static void main(String[] args) {

        try {

            withdraw(500, 1000);

        }
        catch (InsufficientBalanceException e) {

            System.out.println(e.getMessage());
        }
    }
}


