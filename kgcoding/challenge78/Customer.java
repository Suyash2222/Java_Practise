package in.kgcoding.challenge78;

public class Customer {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("005","Suyash");
        account.depositMoney(100);
        System.out.println(account.withdrawalMoney(200));
        account.depositMoney(-40);
        account.withdrawalMoney(0);
    }
}
