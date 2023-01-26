//Thread.yield();线程的礼让
public class xctext07 implements Runnable {
    public void run(){
        System.out.println(Thread.currentThread().getName()+"线程开始运行");
        Thread.yield();//线程礼让，可能礼让也可能不礼让，概率问题
        System.out.println(Thread.currentThread().getName()+"线程结束");
    }

    public static void main(String[] args) {
        xctext07 t1=new xctext07();
        xctext07 t2=new xctext07();
        new Thread(t1,"张三").start();
        new Thread(t2,"李四").start();
    }
}
