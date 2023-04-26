public class MethodDemo extends Thread{

	public void run(){
	
	System.out.println(Thread.currentThread().getName());
	//get name is to get the name of thread and setname is to set the name of a thread.
	System.out.println(Thread.currentThread().getPriority());
	//thread id also can be found
	System.out.println(Thread.currentThread().getId());
	
	}


	public static void main(String[] args){
		
		Thread t1=new MethodDemo();
		Thread t2=new MethodDemo();
		
		t1.setName("First");
		//here t2 is not given name so it is going to take the default name Thread-0,Thread-1 ..
		
		t2.setPriority(MAX_PRIORITY);// you can also do it t2.setPriority(10)
		
		t1.start();
		t2.start();
		
	
	}

}
