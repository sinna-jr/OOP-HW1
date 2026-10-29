public class BankAccount() {

    private final String accountNumber ;
    private String ownerName ;
    private double balance ;

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber ;
        this.ownerName = ownerName ;
        if (balance < 0) System.out.println("Invalid starting balance!");
        this.balance = Math.max(0 , balance ) ;
    }

    public String getAccountNumber() {
        return accountNumber ;
    }

    public String getOwnerName() {
        return ownerName ;
    }

    public double getBalance() {
        return balance ;
    }

    public void setOwnerName(String ownerName) {
        if (ownerName != null && !ownerName.trim().isEmpty()){
            this.ownerName = ownerName ;
        }   else {
            System.out.println("Invalid owner name!");
        }
    }
}
