public class TransactionAccount extends Account{
    private double balance;
    private double specialLimit;

    public TransactionAccount(){
        specialLimit = 200;
    }

    public void withdraw(double value) throws InsufficientBalanceException {
        if(value<=balance){
            this.balance -= value;
        } else if (value<=specialLimit) {
            this.specialLimit -=value;
        }else{
            throw new InsufficientBalanceException("Insufficient balance for withdrawal\n");
        }
    }

    public void deposit(double value){
        if(specialLimit<200){
            double toLimit = 200-specialLimit;
            double remainingValue = value-toLimit;
            if(value>=toLimit){
                specialLimit+=toLimit;
                balance+=remainingValue;
            }else{
                specialLimit+=value;
            }
        }
    }

    public void transfer(double value, TransactionAccount targetAccount) throws InsufficientBalanceException{
        this.withdraw(value);
        targetAccount.deposit(value);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getSpecialLimit() {
        return specialLimit;
    }

    public void setSpecialLimit(double specialLimit) {
        this.specialLimit = specialLimit;
    }
}
