package Thread;

import java.util.Date;

public class MyThread extends Thread {
//    /**
//     * 建立一个线程
//     */
//    public void run() {
//        for (int i = 0; i < 100; i++) {
//            System.out.println("MyThread:" + i);
//        }
//    }
//
//    public static void main(String[] args) {
//        MyThread myThread = new MyThread();
//        myThread.start();
//        for (int j = 0; j < 100; j++) {
//            System.out.println("mainThread:" + j);
//        }
//    }

//    /**
//     * 测试Thread.sleep()方法
//     */
//    public void run(){
//        while(true){
//            System.out.println("==="+new Date()+"===");
//            try {
//                sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//                return;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        MyThread myThread = new MyThread();
//        myThread.start();
//        try {
//            Thread.sleep(10000); // 这里是指主方法线程睡10000ms
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        myThread.interrupt();// 一般不用这个方法中断线程，更不要用stop
//    }

//    /**
//     * 测试Thread赋名和join方法
//     */
//    public MyThread(){};
//    public MyThread(String s){
//        super(s);
//    }
//    public void run(){
//        for (int i = 0;i<10;i++){
//            System.out.println("==="+getName()+"===");
//            try {
//                sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//                return;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        MyThread myThread = new MyThread("子线程");
//        myThread.start();
//        try {
//            myThread.join();// 将这个线程合并到当前主线程里面，也就是不会发生两个线程竞争，而是先执行完myThread里的方法
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        for (int i = 0;i<10;i++){
//            System.out.println("===我是主方法===");
//        }
//    }


//    /**
//     * 测试yield方法
//     */
//    public MyThread(){};
//    public MyThread(String s){
//        super(s);
//    }
//    public void run(){
//        for (int i = 0;i<100;i++){
//            System.out.println("==="+getName()+"==="+i);
//            if (i%10==0) yield();
//        }
//    }
//
//    public static void main(String[] args) {
//        MyThread s1 = new MyThread("s1");
//        MyThread s2 = new MyThread("s2");
//        s1.start();
//        s2.start();
//    }

    /**
     * 设置优先级
     */
    public MyThread(){};
    public MyThread(String s){
        super(s);
    }
    public void run(){
        for (int i = 0;i<1000;i++){
            System.out.println("==="+getName()+"==="+i);
        }
    }

    public static void main(String[] args) {
        MyThread s1 = new MyThread("s1");
        MyThread s2 = new MyThread("s2");
        s1.setPriority(Thread.NORM_PRIORITY+5);// 设置优先级可以改变线程的资源分配
        s1.start();
        s2.start();
    }
}
