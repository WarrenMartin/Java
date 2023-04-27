public class TableSir {

	public synchronized void printTable(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " * " + i + " = " + (n * i));
			// try {
			// 	Thread.sleep(500);
			// } catch (InterruptedException e) {
			// 	e.printStackTrace();
			// }
		}
	}

	public static void main(String[] args) {
		ThreadOne t1 = new ThreadOne();
		
		ThreadTwo t2=new ThreadTwo();
		
		ThreadThree t3=new ThreadThree();
		
		t1.start();
		t2.start();
		t3.start();
	}
}

class ThreadOne extends Thread {

	public void run() {
		TableSir table = new TableSir();
		table.printTable(6);
	}
}

class ThreadTwo extends Thread {

	public void run() {
		TableSir table = new TableSir();
		table.printTable(6);
	}
}

class ThreadThree extends Thread {

	public void run() {
		TableSir table = new TableSir();
		table.printTable(6);
	}
}
