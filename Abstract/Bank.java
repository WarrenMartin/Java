// now to use the abstract ATM we extend bank class
public class Bank extends ATM{

	public Bank(double intrest,int cashback){
		super(intrest,cashback);
	}

	public void withdraw(){
		System.out.println("Withdrawend");
	}

	public void deposit(){
		System.out.println("Deposited");
	}

	@Override
	public void disp(){
		super.disp(); // will call parent class disp method
		System.out.println("I am Bank");
	}
	
	public static void main(String[] args){
		ATM a1=new Bank(5,1);
		a1.disp();
		
		//Bank b1=new Bank(5,11); // you get the same ans only diff is ATM is specifier and Bank is a implementor
		//b1.disp();
	}
	
}
