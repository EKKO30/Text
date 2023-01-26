public class xctext05demo implements Runnable{
    //票数 volatile一种轻量级锁,更新总量,无法保证原子性，只能保证可见性可能出现线程安全问题
    int num=10;
    //重量级锁synchronized其圈定的区域为互斥区，当有一个线程运行该区域时其他线程不能运行，难以出现线程安全问题
    public void run(){
        while(num>0){
            //sleep()是加锁后不变成单线程的关键
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (this){
                if(num==0){
                    break;
                }
                System.out.println(Thread.currentThread().getName() + "抢到了第"+num--+"张火车票");
            }
        }
    }

    public static void main(String[] args) {
        //   三个线程共卖10张票,同一对象调用三个线程一起运行
        xctext05demo t1=new xctext05demo();
        new Thread(t1).start();
        new Thread(t1).start();
        new Thread(t1).start();

    }

}
