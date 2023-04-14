abstract public class ATM{
  
  private double intrest;
  private int cashback;
  
  //constructor
  public ATM(double intrest,int cashback){
    this.intrest=intrest;
    this.cashback=cashback;
  }
  
  public abstract void withdraw();
  
  public abstract void deposit();
  
  public void disp(){
      System.out.println("I am xyz ATM");
  }
}

/*
Note that withdraw and deposit are abstract method that means it is just an idea or an specification
concrete class is the disp in the above example
also disp(){}; this is also a considered a concrete method*/

//Abstract class can contain anything datamembers,constructors,abstract methods,methods
