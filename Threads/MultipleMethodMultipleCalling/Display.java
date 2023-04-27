public class Display{

	public synchronized void dispCapitalLetters(){
		
		for(int i=65;i<=90;i++){
			
			System.out.println((char)i);
		}
		//for uniform excess create a sleep
		
		try{
		Thread.sleep(750);
		
		}catch(InterruptedException e){System.out.println(e);}
	}
	
	public synchronized void dispSmallLetters(){
		
		for(int i=97;i<=122;i++){
			
			System.out.println((char)i);
		}
		//for uniform excess create a sleep
		
		try{
		Thread.sleep(750);
		
		}catch(InterruptedException e){System.out.println(e);}
	}
	
	public synchronized void dispNumbers(){
		
		for(int i=48;i<=57;i++){
			
			System.out.println((char)i);  //ascii 48 is 0 and ascii 57 is 9
		}
		//for uniform excess create a sleep
		
		try{
		Thread.sleep(750);
		
		}catch(InterruptedException e){System.out.println(e);}
	}

}

