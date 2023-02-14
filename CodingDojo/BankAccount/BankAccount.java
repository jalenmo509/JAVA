public class BankAccount{
  private double checkingBalance;
  private double savingsBalance;
  private static int numberOfAccounts = 0;
  private static double totalAmountAll=0;
  
  public BankAccount(){
    checkingBalance=0;
    savingsBalance=0;
    numberOfAccounts++;
  }
  public BankAccount(double checkingBalance, double savingsBalance){
    this.checkingBalance=checkingBalance;
    this.savingsBalance=savingsBalance;
    numberOfAccounts++;
  }

  public double getCheckingBalance(){
    return checkingBalance;
  }

  public double getSavingsBalance(){
    return savingsBalance;
  }

  public void deposit(String accountType, double amount){
    if(accountType=="Checking" || accountType== "checking"){
      checkingBalance+=amount;
    } else {
      savingsBalance+=amount;
    }
    totalAmountAll+=amount;
  }

  public void withdraw(String accountType, double amount){
    if(accountType=="Checking" || accountType== "checking"){
      if(checkingBalance>=amount){
        checkingBalance-=amount;
        totalAmountAll-=amount;
        System.out.println("Successful Withdrawal from checkings");
      } else {
        System.out.println("Insufficient Funds in checkings");
      }
    } else {
      if(savingsBalance>=amount){
        savingsBalance-=amount;
        totalAmountAll-=amount;
        System.out.println("Successful Withdrawal from savings");
      } else {
        System.out.println("Insufficient Funds in savigns");
      }
    }
  }

  public void displayBalances(){
    System.out.println("Checkings Balance: "+checkingBalance);
    System.out.println("Savings Balance: "+savingsBalance);
    System.out.println("Total Balance: "+(savingsBalance+checkingBalance));
  }

}