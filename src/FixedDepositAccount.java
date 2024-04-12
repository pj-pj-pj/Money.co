import java.time.LocalDate;

public class FixedDepositAccount extends Account {
    private LocalDate startDate;
    private int lockInPeriodMonths;
    private boolean isLockInPeriodOver;
    private FixedDepositTransactor transactor;

    public FixedDepositAccount(String accountName, int lockInPeriodMonths) {
        super(accountName);
        this.lockInPeriodMonths = lockInPeriodMonths;
        this.startDate = LocalDate.now(); // Setting the start date to the current date
        this.transactor = new FixedDepositTransactor();
        this.isLockInPeriodOver = calculateIfLockInPeriodOver();
    }

    @Override
    public void withdraw(LocalDate date, double amount, String description) {
        transactor.decrement(this, amount, isLockInPeriodOver);
        Transaction withdrawTransaction = new Transaction(date, amount, "Withdraw", description);
        transactions.add(withdrawTransaction);
    }

    public void withdraw(LocalDate date, double amount) {
        transactor.decrement(this, amount, isLockInPeriodOver);
        Transaction withdrawTransaction = new Transaction(date, amount, "Withdraw");
        transactions.add(withdrawTransaction);
    }
    
    private boolean calculateIfLockInPeriodOver() {
        LocalDate currentDate = LocalDate.now();
        LocalDate endDate = startDate.plusMonths(lockInPeriodMonths);
        
        return currentDate.isAfter(endDate); // true if the current date is after the end of the lock-in period
    }
}
