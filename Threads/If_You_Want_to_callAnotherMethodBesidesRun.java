public class ThreadDemo extends Thread {

    @Override
    public void run() {
        System.out.println("I am the run() method");
    }

    public void blah() {
        System.out.println("Blah");
    }

    public static void main(String[] args) {
        ThreadDemo thread = new ThreadDemo();
        thread.start();
        thread.blah();
    }
}
