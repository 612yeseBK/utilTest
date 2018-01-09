package Thread;

public class MyRunner implements Runnable {
    public void run() {
        for (int i = 0;i<100;i++){
            System.out.println("Myrunner:"+i);
        }
    }
    public static void main(String[] args){
        MyRunner myRunner = new MyRunner();
        Thread thread = new Thread(myRunner);
        thread.start();
//        myRunner.run();

        for (int j = 0;j<100;j++){
            System.out.println("mainThread:"+j);
        }

    }
}
