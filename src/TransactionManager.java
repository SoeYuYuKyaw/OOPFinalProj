import java.util.*;
public class TransactionManager {
    private List<Transaction> transactions;

    public TransactionManager() {
       transactions = new ArrayList<>();
    }
 
    public void addTransaction(Transaction transaction) {
       transactions.add(transaction);
    }
 
    public void printTransactions() {
       for (Transaction transaction : transactions) {
          System.out.println(transaction.toString());
       }
    }
}
