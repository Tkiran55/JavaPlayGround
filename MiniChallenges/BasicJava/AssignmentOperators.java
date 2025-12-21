package BasicJava;

public class AssignmentOperators {
    public static void main(String[] args) {
        double balance = 1000.00;
        System.out.println("Starting Balance: " + balance);

        double deposit = 500;
        balance += deposit;
        System.out.println("After deposit: " + balance);

        double withdraw = 200;
        balance -= withdraw;
        System.out.println("After Withdrawal: " + balance);

        double interest = 1.05;
        balance *= interest;
        System.out.println("After Interest: " + balance);
    }
}
