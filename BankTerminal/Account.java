public class Account {
    private int number;
    private String agency;
    private String customerName;
    private double balance;

    Account(int number, String agency, String customerName, double balance){
        if (number <=0) {
            throw  new IllegalArgumentException("Account number should be greater than 0");
        }
        if (agency == null || agency.isEmpty()) {
            throw  new IllegalArgumentException("Agency cannot be null or empty");
        }
        if (customerName == null || customerName.isEmpty() ) {
            throw  new IllegalArgumentException("Customer's name cannot be null or empty");
        }

        this.number = number;
        this.agency = agency;
        this.customerName = customerName;
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
