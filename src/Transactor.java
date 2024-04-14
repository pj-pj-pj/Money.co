import java.time.LocalDate;

public interface Transactor {
    public abstract double recordIncome(Account account, LocalDate date, double amount, String description);
    public abstract double recordExpense(Account account, LocalDate date, double amount, String description);
}