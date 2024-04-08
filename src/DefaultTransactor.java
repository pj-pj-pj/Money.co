public class DefaultTransactor implements Transactor {
  @Override
  public double increment(Account account, double amount) {
      if (amount > 0) {
          account.setBalance(account.getBalance() + amount);
      }
      return account.getBalance();
  }

  @Override
  public double decrement(Account account, double amount) {
      account.setBalance(account.getBalance() - amount);
      return account.getBalance();
  }
}