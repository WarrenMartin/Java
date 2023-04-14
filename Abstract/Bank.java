// now to use the abstract ATM we extend bank class

public class Bank extends ATM{
    
  public void withdraw(){
  System.out.println("Withdraw success");
}
  public void deposit(){
    System.out.println("Money Deposited");
  }
}
