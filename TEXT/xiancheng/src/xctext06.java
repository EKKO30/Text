//join()线程插队
public class xctext06 implements Runnable{
    public void run(){
        for (int i = 0; i < 50; i++) {
            System.out.println("来插队的线程"+i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        //子线程
        xctext06 a=new xctext06();
        Thread thread=new Thread(a);
        thread.start();

        //主线程
        for (int i = 0; i < 100; i++) {
            if(i==30){
                thread.join();
            }
            System.out.println("main"+i);
        }
    }
}
