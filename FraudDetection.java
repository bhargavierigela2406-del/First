
import java.util.Scanner;

public class FraudDetection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amount, attempts;

        System.out.print("Enter transaction amount: ");
        amount = sc.nextInt();

        System.out.print("Enter number of transaction attempts: ");
        attempts = sc.nextInt();

        if (amount > 10000) {
            System.out.println("Alert: Possible Fraud - Amount too large!");
        }
        else if (attempts > 3) {
            System.out.println("Alert: Possible Fraud - Too many attempts!");
        }
        else {
            System.out.println("Transaction Approved");
        }

        sc.close();
    }
}