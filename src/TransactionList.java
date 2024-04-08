import java.util.ArrayList;
import java.util.List;

public class TransactionList {
    private List<Transaction> transactions;

    public TransactionList() {
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public List<Transaction> filterTransactions(TransactionFilter filter) {
        List<Transaction> filteredTransactions = new ArrayList<>();
        for (Transaction transaction : transactions) {
            if (filter.matches(transaction)) {
                filteredTransactions.add(transaction);
            }
        }
        return filteredTransactions;
    }
}
