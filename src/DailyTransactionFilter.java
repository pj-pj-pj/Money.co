import java.time.LocalDate;

public class DailyTransactionFilter implements TransactionFilter {
  private LocalDate date;

  public DailyTransactionFilter(LocalDate date) {
      this.date = date;
  }

  @Override
  public boolean matches(Transaction transaction) {
      return transaction.getDate().isEqual(date);
  }
}