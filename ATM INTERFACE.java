                                                                //ATM INTERFACE
import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Your current balance is: " + balance+" INR");
        } else {
            System.out.println("Please press a valid deposit amount.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Your current balance is: " + balance+" INR");
            return true;
        } else {
            System.out.println("You don't have e a sufficient amount of money to withdrawal");
            return false;
        }
    }
}

class ATM {
    private BankAccount bankAccount;
    private Scanner scanner;

    public ATM(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("ATM Menu:");
        System.out.println("To Check Balance press 1");
        System.out.println("To Deposit Amount press 2");
        System.out.println("To Withdraw Amount press 3");
        System.out.println("For Exit press 4");
    }

    public void run() {
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your current balance is " + bankAccount.getBalance()+" INR");
                    break;
                case 2:
                    System.out.print("Please Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    bankAccount.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Please Enter the amount to withdraw: ");
                    double withdrawalAmount = scanner.nextDouble();
                    bankAccount.withdraw(withdrawalAmount);
                    break;
                case 4:
                    System.out.println("Exiting ATM. Thank you!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}

public class Interger {
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1000); // Initialize with initial balance
        ATM atm = new ATM(userAccount);
        atm.run();
    }
}
