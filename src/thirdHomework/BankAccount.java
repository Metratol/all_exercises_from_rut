package thirdHomework;

public class BankAccount {
    private final static double DEFAULT_INTEREST_RATE = 0.02;
    private static double interestRate = DEFAULT_INTEREST_RATE;
    private static int bankAccountCount = 0;
    private int id;
    private double balance;

    BankAccount() {
        this.id = bankAccountCount++;
    }


    static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    void deposit (double amount){
        this.balance += amount;
    }

    double  getInterest(int years){
        return BankAccount.interestRate * years * this.balance;
    }

    public  int getId() {
        return id;
    }

    static int getBankAccountCount() {
        return bankAccountCount;
    }

    public static double getInterestRate() {
        return interestRate;
    }
}

