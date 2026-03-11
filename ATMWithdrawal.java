import java.util.Scanner;

public class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 10000;   // Initial balance
        int withdraw;

        System.out.println("Enter amount to withdraw: ");
        withdraw = sc.nextInt();

        if (withdraw % 100 != 0) {
            System.out.println("Amount should be in multiples of 100");
        }
        else if (withdraw > balance) {
            System.out.println("Insufficient balance");
        }
        else {
            balance = balance - withdraw;
            System.out.println("Please collect your cash");
            System.out.println("Remaining balance: " + balance);
        }

        sc.close();
    }
}
