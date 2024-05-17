public class SavingsAccount extends Account{
    private double balance;
    //pegar a data em que foi feito um depósito na poupança
    private double income;

    private final String accountId;

    public SavingsAccount(){
        super();
        accountId = getAccountNumber() + "-P";
    }


    public double getBalance() {
        return balance;
    }

    public double getIncome() {
        return income;
    }

    public String getAccountId() {
        return accountId;
    }
}
