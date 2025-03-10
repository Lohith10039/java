public class BankAcc {
    // Declaring the variables
    private String name;
    private int accNo;
    private double balance;

    // Constructor to initialize values
    public BankAcc(String name, int accNo, double balance) {
        this.name = name;
        this.accNo = accNo;
        this.balance = balance;
        System.out.println("Welcome to the bank");
        System.out.println("Account Details: Name - " + name + ", Account No - " + accNo + ", Balance - " + balance);
    }

    // Method for withdrawal
    public void withdraw(double amount) {
        System.out.println("Withdrawal amount: " + amount);
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Transaction successful! Current balance: " + balance);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    // Method for deposit
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit amount: " + amount);
        System.out.println("Balance after deposit: " + balance);
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("ch lohith");
        System.out.println("AV.SC.U4CSE24039");
        System.out.println("CSE-A");

        // Creating account objects
        BankAcc cus1 = new BankAcc("ram", 98765, 30000);
        cus1.deposit(17000);
        cus1.withdraw(20000);

        BankAcc cus2 = new BankAcc("raj",98765,50000);
        cus2.deposit(17000);
        cus2.withdraw(20000);
    }
}