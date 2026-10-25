
public class BankAccount {

 private final String accountNumber;
 private String ownerName;
 private double balance;

 public BankAccount(String accountNumber, String ownerName, double balance) {}

 public String getAccountNumber() {
  return accountNumber;
 }

 public String getOwnerName() {
  return ownerName;
 }

 public double getBalance() {
  return balance;
 }

 public void setOwnerName(String ownerName) {}

 public void deposit(double amount) {}

 public void withdraw(double amount) {}

 public void displayAccountInfo() {}

}
