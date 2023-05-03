import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class BudgetManagementSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance = 0.0;
        boolean validInput = false;
  
        while (!validInput) {
           try {
              System.out.println("Please select an option:");
              System.out.println("1. Add income");
              System.out.println("2. Add expense");
              System.out.println("3. Check current balance");
              System.out.println("4. Quit");
  
              int choice = input.nextInt();
  
              if (choice == 1) {
                 System.out.println("Enter income amount:");
                 double income = input.nextDouble();
                 balance += income;
                 System.out.println("Income added successfully.");
                 saveTransactionToFile("Income", income, balance);
              } else if (choice == 2) {
                 System.out.println("Enter expense amount:");
                 double expense = input.nextDouble();
                 if (balance < expense) {
                    try {
                       throw new InsufficientBalance("Insufficient balance!");
                    } catch (InsufficientBalance e) {
                       System.out.println(e.getMessage());
                       continue;
                    }
                 }
                 balance -= expense;
                 System.out.println("Expense added successfully.");
                 saveTransactionToFile("Expense", expense, balance);
              } else if (choice == 3) {
                 System.out.println("Your current balance is: " + balance);
              } else if (choice == 4) {
                 System.out.println("Thank you for using our budget management system.");
                 validInput = true;
              } else {
                 System.out.println("Invalid choice! Please try again.");
              }
           } catch (InputMismatchException e) {
              System.out.println("Please enter 1, 2, 3, or 4 only.");
              input.next(); // discard non-integer input
           }
        }
    }
    // Save transactions to file
    private static void saveTransactionToFile(String transactionType, double transactionAmount, double currentBalance) {
      try {
          FileWriter writer = new FileWriter("transactions.txt", true);
          writer.write(transactionType + ": " + transactionAmount + "\n");
          writer.write("Current balance: " + currentBalance + "\n\n");
          writer.close();
          System.out.println("Transaction saved to file.");
      } catch (IOException e) {
          System.out.println("Error writing to file: " + e.getMessage());
      }
      }
}