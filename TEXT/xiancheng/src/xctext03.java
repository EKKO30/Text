//通过实现Runnable来创建线程
public class xctext03 {

    public static void main(String[] args) {

        Runnable runnable=new zxc();
        Thread thread=new Thread(runnable);
        thread.start();
    }
}

class zxc implements Runnable{
    public void run(){
        System.out.println("该线程开始运行");
    }

}

