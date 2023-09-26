package ch06;

public class Account {

  int balance;

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    if(balance>0 && balance<1_000_000){
      this.balance = balance;
    }else{
      return;
    }

  }
}
