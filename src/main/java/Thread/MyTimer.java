package Thread;

public class MyTimer {
    private int num=0;
    public void add(String name) {
        // t1,t2访问了同样一个timer对象，使用了同一个num数据，
        // 由于第一个比如说t1  sleep了，这时候t2就会执行，并执行完，然后t1接下去继续执行，这时候num并不是t1之前应该获得num
        synchronized (this) {// 使用synchronized（this）可以锁定当前对象  这里也可以synchronized写在add方法上面
            num++;
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + ":你是第" + num + "使用者");
        }
    }
}
