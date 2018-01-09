package Thread;

public class ThreadSyc implements Runnable{
    MyTimer myTimer = new MyTimer();
    public void run() {
        myTimer.add(Thread.currentThread().getName());
    }

    public static void main(String[] args){
        ThreadSyc threadSyc = new ThreadSyc();
        Thread t1 = new Thread(threadSyc);
        Thread t2 = new Thread(threadSyc);
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();


    }
}
