import java.util.Scanner;

class BankAccount {
    private double balance = 0;   

    void deposit(double amt) {
        balance += amt;
    }

    void withdraw(double amt) {
        if (amt <= balance)
            balance -= amt;
        else
            System.out.println("Insufficient Balance");
    }

    void showBalance() {
        System.out.println("Balance: " + balance);
    }
}

public class BankMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount b = new BankAccount();

        int ch;
        do {
            System.out.println("\n1.Deposit  2.Withdraw  3.Balance  4.Exit");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();

            if (ch == 1) {
                System.out.print("Enter amount: ");
                b.deposit(sc.nextDouble());
            }
            else if (ch == 2) {
                System.out.print("Enter amount: ");
                b.withdraw(sc.nextDouble());
            }
            else if (ch == 3) {
                b.showBalance();
            }

        } while (ch != 4);
    }
}
    

