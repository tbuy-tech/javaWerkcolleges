package threads;

public class SimpleThread extends Thread {

    @Override
    public void run() {
        for (int i = 5; i >= 0; i--) {
            System.out.println("Thread " + Thread.currentThread().getName() + " : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
