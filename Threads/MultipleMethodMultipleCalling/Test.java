
public class Test{

	public static void main(String[] args){
	Display d= new Display();
	
	// creating annnomous innner class. and note that annomous inner class itself is a class.
	
	Thread t1=new Thread(){
		
		public void run(){
			d.dispCapitalLetters();
		}
	};
	
	
	Thread t2=new Thread(){
		
		public void run(){
			d.dispSmallLetters();
		}
	};
	
	Thread t3=new Thread(){
		
		public void run(){
			d.dispNumbers();
		}
	};
	
	t1.start();
	t2.start();
	t3.start();
	 
	}	
	
}
