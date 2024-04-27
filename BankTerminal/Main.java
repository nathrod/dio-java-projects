public class Main {
    public static void main(String[] args){

        int accountNumber = Integer.parseInt(args[0]);
        String agency = args[1];
        String name = args[2];
        double balance = Double.parseDouble(args[3]);

        try{
            Account account = new Account(accountNumber,agency,name,balance);
            System.out.println("Hello " + name + ", Thank you for creating your account at BankTerminal! Your informations are:\nAgency: " + agency + "\nAccount Number: " + accountNumber + "\nBalance: $" + balance +"\n*Balance is already available for withdrawal");
        }catch (IllegalArgumentException e){
            System.out.println("Error when creating the account: " + e.getMessage());
        }
    }
}
