//卖票案例
public class xctext05 implements Runnable{
    //票数 volatile一种轻量级锁,更新总量,无法保证原子性，只能保证可见性可能出现线程安全问题
    int num=10;
    //重量级锁synchronized其圈定的区域为互斥区，当有一个线程运行该区域时其他线程不能运行，难以出现线程安全问题
    public void run(){
        //当前时间
        long l1=System.currentTimeMillis();
        while(num>0){
            synchronized (this) {
                System.out.println(Thread.currentThread().getName() + "抢到了第"+num+"张火车票");
                num--;
            }
        }
        long l2=System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName()+"---------------------该程序耗时"+(l2-l1));
    }

    public static void main(String[] args) {
        //   三个线程共卖10张票,同一对象调用三个线程一起运行
        xctext05 t1=new xctext05();
        new Thread(t1).start();
        new Thread(t1).start();

        //三个线程各卖100张票，三个对象各用三个线程运行(若是num变static则共卖100张，因为static修饰内存中只有一份且属于类不属于对象)
     /*   xctext05 t1 = new xctext05();
        xctext05 t2 = new xctext05();
        xctext05 t3 = new xctext05();
        new Thread(t1, "阿萨").start();
        new Thread(t2, "蔷薇").start();
        new Thread(t3, "发刀").start();*/
    }

}
