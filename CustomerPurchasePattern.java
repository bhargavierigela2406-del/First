import java.util.Scanner;

public class CustomerPurchasePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] products = {"Laptop", "Mobile", "Tablet", "Laptop", "Mobile"};
        int laptop = 0, mobile = 0, tablet = 0;

        for (int i = 0; i < products.length; i++) {
            if (products[i].equals("Laptop"))
                laptop++;
            else if (products[i].equals("Mobile"))
                mobile++;
            else if (products[i].equals("Tablet"))
                tablet++;
        }

        System.out.println("Laptop purchases: " + laptop);
        System.out.println("Mobile purchases: " + mobile);
        System.out.println("Tablet purchases: " + tablet);

        sc.close();
    }
}