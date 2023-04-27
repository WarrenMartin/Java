public class TableSir2 {

	public synchronized void printTable(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " * " + i + " = " + (n * i));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		TableSir2 table = new TableSir2();
		ThreadOne t1 = new ThreadOne(table);
		ThreadTwo t2 = new ThreadTwo(table);
		ThreadThree t3 = new ThreadThree(table);
		t1.start();
		t2.start();
		t3.start();
	}
}

class ThreadOne extends Thread {
	TableSir2 t;


	public ThreadOne(TableSir2 t) {
		this.t = t;
	}

	public void run() {
		t.printTable(6);
	}
}

class ThreadTwo extends Thread {
	TableSir2 t;

	public ThreadTwo(TableSir2 t) {
		this.t = t;
	}

	public void run() {
		t.printTable(7);
	}
}

class ThreadThree extends Thread {
	TableSir2 t;

	public ThreadThree(TableSir2 t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}
}

