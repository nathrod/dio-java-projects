import java.util.Date;

public class TransactionRecord {
    private Account sourceAccount;
    private Account targetAccount;
    private double value;
    private Date transactionDate;

    public TransactionRecord(Account sourceAccount, Account targetAccount, double value) {
        this.sourceAccount = sourceAccount;
        this.targetAccount = targetAccount;
        this.value = value;
        this.transactionDate = new Date();
    }

    public Account getSourceAccount() {
        return sourceAccount;
    }

    public Account getTargetAccount() {
        return targetAccount;
    }

    public double getValue() {
        return value;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }
}