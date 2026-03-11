import java.util.Scanner;

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] books = new String[5];
        int count = 0;
        int choice;

        do {
            System.out.println("\n1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1:
                    if(count < books.length) {
                        System.out.print("Enter book name: ");
                        books[count] = sc.nextLine();
                        count++;
                        System.out.println("Book added successfully");
                    } else {
                        System.out.println("Library is full");
                    }
                    break;

                case 2:
                    System.out.println("Available Books:");
                    for(int i = 0; i < count; i++) {
                        if(books[i] != null)
                            System.out.println((i+1) + ". " + books[i]);
                    }
                    break;

                case 3:
                    System.out.print("Enter book number to issue: ");
                    int num = sc.nextInt();
                    if(num <= count && books[num-1] != null) {
                        System.out.println("Book issued: " + books[num-1]);
                        books[num-1] = null;
                    } else {
                        System.out.println("Book not available");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while(choice != 4);

        sc.close();
    }
}