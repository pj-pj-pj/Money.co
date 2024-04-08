import java.time.LocalDate;

public class MonthlyTransactionFIlter implements TransactionFilter {
  private int year;
  private int month;

  public MonthlyTransactionFIlter(int year, int month) {
      this.year = year;
      this.month = month;
  }

  @Override
  public boolean matches(Transaction transaction) {
      LocalDate transactionDate = transaction.getDate();
      return transactionDate.getYear() == year && transactionDate.getMonthValue() == month;
  }
}