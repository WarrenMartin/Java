public class Table extends Thread {
   
    
    
    public synchronized void nonsense(int n){
    
    	 for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
            try {
                Thread.sleep(500);
              
            } catch (InterruptedException e) { 
                System.out.println(e);
            }
        }
    }
	
	@Override
    public synchronized void run() {
        nonsense(6);
        nonsense(5);
       
        
    }

    public static void main(String[] args) {
        Table t1 = new Table(); 
        t1.start(); 
        Table t2=new Table();
        t2.start();
    }
}
