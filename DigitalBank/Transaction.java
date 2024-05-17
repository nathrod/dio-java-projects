import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Transaction {
    private static int transactionCounter = 0;
    private int transactionId;
    private Date transactionDate;
    private List<TransactionRecord> transactionRecords;

    public Transaction(){
        transactionId = ++transactionCounter;
        transactionDate = new Date();
        transactionRecords = new ArrayList<>();
    }

    public void addTransaction(TransactionRecord transactionRecord) {
        transactionRecords.add(transactionRecord);
    }

    public List<TransactionRecord> getTransactionRecords() {
        return transactionRecords;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }
}