abstract public class ATM{
  
  public abstract void withdraw();
  
  public abstract void deposit();
  
  public void disp(){
      System.out.println("I am xyz ATM");
  }
}

/*
Note that withdraw and deposit are abstract method that means it is just an idea or an specification
concrete class is the disp in the above example
also disp(){}; this is also a considered a concrete method
