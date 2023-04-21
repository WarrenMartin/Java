public class BankApp{
	double balance;
	
	public BankApp(double balance){
		 this.balance=balance;
	}
	
	public void disp(){
		System.out.println("bal: "+balance);
	}
	
	public void withdraw(double amount) throws InsufficientFundsException{
		
		if(balance<amount){
			throw new InsufficientFundsException("less balance");
		}
		else{
			balance=balance-amount;
		}
	}


	public static void main(String[] args){
	
		BankApp app=new BankApp(25000);
		app.disp();
		
		try{
			app.withdraw(1500);
			app.withdraw(5000000);
		}
		catch(InsufficientFundsException e){
			System.out.println(e.getMessage());
		}
		finally{
			app.balance=500;
		}
		System.out.println(app.balance);
		
		
		
	
	}


}
