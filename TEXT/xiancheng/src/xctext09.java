import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//Lock锁
public class xctext09 implements Runnable {
    int num = 10;
    Lock l=new ReentrantLock();
    public void run() {
        while (num>0){
            try {
                Thread.sleep(188);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            l.lock();
            if(num==0){
                break;
            }
            System.out.println(Thread.currentThread().getName() + "抢到了第"+num--+"张火车票");
            l.unlock();
        }
    }



    public static void main(String[] args) {
        //   三个线程共卖10张票,同一对象调用三个线程一起运行
        xctext09 t1 = new xctext09();
        new Thread(t1).start();
        new Thread(t1).start();
        new Thread(t1).start();
    }
}