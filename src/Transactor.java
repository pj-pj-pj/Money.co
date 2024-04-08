public interface Transactor {
    public abstract double increment(Account account, double amount);
    public abstract double decrement(Account account, double amount);
}