public class Main1 {

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("ACC-101", "Alice", 1000);
        acc1.deposit(-200);
        acc1.deposit(500);
        acc1.withdraw(2000);
        acc1.withdraw(300);

        System.out.println();
        acc1.displayAccountInfo();

    }




}