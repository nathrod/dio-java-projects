public abstract class Account {
    private int accountNumber;
    private Customer customer;

    private static int SEQUENCIAL = 1;

    public Account(){
        accountNumber = SEQUENCIAL++;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
