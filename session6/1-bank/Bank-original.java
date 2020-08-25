class UserAccount {

  /**
    name of this user
  */
  public final String userName;

  /**
    current balance of this user
  */
  private int balance;

  /**
    one paramter constructor
    it get the name and set it
    and set balance to zero
  */
  public UserAccount(String userName) {
    this.userName = userName;
    this.balance = 0;
  }

  /**
     two parameter constructor
     get and set name and also initialBalance
  */
  public UserAccount(String userName, int initialBalance) {
    this.userName = userName;
    this.balance = initialBalance;
  }

  /**
    check if this user have this amount of money or not
  */
  public boolean haveMoney(int amount) {
    if (balance >= amount)
      return true;
    else
      return false;
  }

  /**
    move money from this user to another one
    if source account doesn't have enough money, return false
  */
  public boolean moveMoneyTo(UserAccount dest, int amount) {
    if (this.haveMoney(amount)) {
      dest.balance += amount;
      this.balance -= amount;
      return true;
    } else
      return false;
  }

  /**
    return a print friendly string about status of this user
  */
  public String toString() {
    return "UserAccount " + this.userName + " : " + this.balance;
  }
}

public class Bank {

  /**
    an array contains UserAccounts of this bank
  */
  UserAccount[] accounts;

  /**
    number of previously added accounts to this bank
  */
  int numberOfAccounts = 0;

  /**
    name of this bank
  */
  public final String name;

  /**
    constructor of this class,
    set bank name and maximum number of accounts will be added
  */
  public Bank(String bankName,
              int maxAccountsCount) { // constructor -> no return type
    this.name = bankName;
    accounts = new UserAccount[maxAccountsCount];
  }

  /**
    get summary of UserAccounts
  */
  public String getReport() {
    String report = "report of " + this.name + "\n";
    for (int i = 0; i < numberOfAccounts; i++) {
      report += accounts[i].toString() + "\n";
    }
    report += "-------------\n";
    return report;
  }

  /**
    add an account to the bank
  */
  public boolean addAccount(UserAccount a) {
    if (this.numberOfAccounts == this.accounts.length) {
      return false; // the bank is full
    }
    this.accounts[this.numberOfAccounts] = a;
    this.numberOfAccounts++;
    return true;
  }

  public UserAccount getAccount(String username) {
    for (int i = 0; i < this.numberOfAccounts; i++) {
      if (accounts[i].userName.equals(username))
        return accounts[i];
    }
    return null; // the user not found
  }

  public static void main(String[] args) {
    Bank bank = new Bank("imaginary bank", 10); // maximum 10 user
    bank.addAccount(new UserAccount("ali", 100));
    bank.addAccount(new UserAccount("roozbeh", 30));
    bank.addAccount(new UserAccount("mohammad"));
    System.out.print(bank.getReport());

    bank.getAccount("roozbeh").moveMoneyTo(bank.getAccount("mohammad"), 50);
    System.out.print(
        bank.getReport()); // nothing chaned, roozbeh didnt have enough money

    bank.getAccount("ali").moveMoneyTo(bank.getAccount("mohammad"), 50);
    System.out.print(bank.getReport()); // the money moved
  }
}
