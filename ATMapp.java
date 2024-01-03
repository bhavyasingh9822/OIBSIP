import java.util.Scanner;

class User {
    private String userId;
    private String pin;
    public User(String userId, String pin) {
        this.userId = userId;
        this.pin = pin;
    }
    public String getUserId() {
        return userId;
    }

    public String getPin() {
        return pin;
    }
}

class Account {
    private double balance;
    private String userId;

    public Account(String userId) {
        this.userId = userId;
        this.balance = 1000.0; // Initial balance 
    }

    public double getBalance() {
        return balance;
    }

    public String getUserId() {
        return userId;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    // Add other account-related functionalities as needed
}

class ATMInterface {
    private User currentUser;
    private Account currentAccount;

    public ATMInterface(User user, Account account) {
        this.currentUser = user;
        this.currentAccount = account;
    }

    public void displayMenu() {
        System.out.println("welcome, " + currentUser.getUserId() );
        System.out.println("Welcome to our Bank Branch ATM ");
        System.out.println(" ");
        System.out.println("Select one option for further enquries" );
        System.out.println("Press 1 for Check Balance");
        System.out.println("Press 2 for Withdraw");
        System.out.println("Press 3 for Exit");
        System.out.println("Press 4 for Transfer");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Balance: " + currentAccount.getBalance());
                break;
            case 2:
                System.out.print("Enter withdrawal amount: ");
                double amount = scanner.nextDouble();
                currentAccount.withdraw(amount);
                break;
            case 3:
                System.out.println("You are Exiting ");
                System.out.println("    !!THANK YOU!!     ");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }

        displayMenu(); // Show the menu again after completing an operation
    }
}

public class ATMapp {
    public static void main(String[] args) {
        // Initialize user and account
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter User ID: ");
        String userId = scanner.next();
        System.out.print("Enter PIN: ");
        String pin = scanner.next();

        User user = new User(userId, pin);
        Account account = new Account(userId);

        // Validate user credentials (for simplicity, skipping actual authentication)
        if (!pin.equals(user.getPin())) {
            System.out.println("Invalid PIN. Exiting.");
            System.exit(0);
        }

        // Initialize and start ATM interface
        ATMInterface atmInterface = new ATMInterface(user, account);
        atmInterface.displayMenu();
    }
}
