package ch06;

public class Account20 {
  String an;
  String name;
  int balance;

  public Account20(String an,String name,int balance){
    this.an=an;
    this.name=name;
    this.balance=balance;
  }

  public String getAn() {
    return an;
  }

  public void setAn(String an) {
    this.an = an;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }
}
