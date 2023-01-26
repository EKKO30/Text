
//synchronized可以锁住对象
public class xctext08 extends Thread{
    //synchronized锁调用methodA的对象
    public synchronized void methodA() throws InterruptedException {
        System.out.println("methodA开始运行");
        //线程睡眠3s
        Thread.sleep(3000);
    }
    //synchronized锁调用methodB的对象，所以methodB需要等methodA中睡眠3S再运行
    public void methodB(){
        synchronized (this){
            System.out.println(Thread.currentThread().getName()+"开始运行methodB");
        }
    }
    //synchronized锁常量ａ
    public void methodC(){
        String a="method";
        synchronized (a){
            System.out.println(a+"开始运行methodC");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        xctext08 t1 = new xctext08();
        xctext08 t2 = new xctext08();

        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    t1.methodA();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread1.start();

        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                t1.methodB();
            }
        },"t1");
        thread2.start();

        Thread thread3=new Thread(new Runnable() {
            @Override
            public void run() {
                t1.methodC();
            }
        });
        thread3.start();

        Thread thread4=new Thread(new Runnable() {
            @Override
            public void run() {
                t2.methodB();
            }
        },"t2");
        thread4.start();
    }

}
