package Timer;



import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimerTask;
import java.util.Timer;

public class MyTask extends TimerTask {

    public void run() {
        SimpleDateFormat sdf = null;
        sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        System.out.println("当前时间：" + sdf.format(new Date()));
    }

//    @Test
    public static void main(String[] args){
        Timer t = new Timer(); // 建立Timer对象
        MyTask task = new MyTask(); //定义任务
//        t.schedule(task, 1000,2000);//设置任务的执行，1秒后开始，每2秒执行一次
        System.out.println();
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MINUTE, 30);

        t.schedule(task, cal.getTime() , 2000);
    }

}
